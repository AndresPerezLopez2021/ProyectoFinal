window.onload = cargaPagina;

function cargaPagina(){

    leerLocalStorage();
   document.getElementById('entrar').addEventListener("click", escribirLocalStorage);
   document.getElementById("sidebar").style.maxWidth = "325px";
   document.getElementById("claro").addEventListener("click", claro);
   document.getElementById("oscuro").addEventListener("click", oscuro);
   cargarGaleria();
//formularioIdentificacion();

}
function nodoCerrarSesion() {

    let login = document.getElementById("login");
    let cerrarSesion = document.createElement("a");
    cerrarSesion.setAttribute("href", "principal.html");
    cerrarSesion.setAttribute("onclick", 'eliminarLocalStorage();');
    let textoSesion = document.createTextNode("Cerrar Sesión");
    cerrarSesion.appendChild(textoSesion);
    login.appendChild(cerrarSesion);
    console.log(login.appendChild(cerrarSesion));

}
//IDENTIFICACIÓN//
function escribirLocalStorage() {
    /* Verifica la posibilidad de usar localStorage y JSON */
    if (typeof localStorage != "undefined" && JSON) {
        /* Definición de un objeto Javascript datosPersona */
        var datosPersona = {
            nombre: document.getElementById("nombre").value,


        };
        /* Serialización en un objeto JSON de nombre identidad */
        localStorage.setItem("identidad", JSON.stringify(datosPersona));

        /* Visualización de control */
        console.log(`Valor almacenado: ${JSON.stringify(datosPersona)}`);
    } else {
        /* Mensaje de error (sin posibilidad de almacén localStorage) */
        alert("localStorage no está soportado");
    }
};
//Ingreso del usuario
function leerLocalStorage() {
    let datosPersona;
    /* Verifica la posibilidad de usar localStorage y JSON */
    if (typeof localStorage != "undefined" && JSON) {
        // comprobamos si hay datos almacenados
        if (localStorage.getItem('identidad') !== undefined && localStorage.getItem('identidad')) {
            /* Deserialización del objeto JSON leído */
            datosPersona = JSON.parse(localStorage.getItem("identidad"));

            // Actualización de los campos de visualización
            document.getElementById("login").innerHTML = (`<b>Bienvenido, ${datosPersona.nombre} </b>`);
            nodoCerrarSesion();
            /* Visualización de control */
            console.log("Lectura desde localStorage realizada");
        }
    } else {
        /* Mensaje de error (sin posibilidad de almacén localStorage) */
        alert("localStorage no está soportado");
    }

};
/*Función eliminarLocalStorage */
function eliminarLocalStorage() {

    /* Verifica la posibilidad de usar localStorage y JSON */
    if (typeof localStorage != "undefined" && JSON) {
        //confirmación de que se quiere cerrar sesión
        var mensajeConfirm = confirm("¿Quiere Cerrar la Sesión Actual?");
        if (mensajeConfirm == true) {

            localStorage.removeItem("identidad");
            location.reload();
        }
        /* Visualización de control */

    } else {
        /* Mensaje de error (sin posibilidad 	de almacén localStorage) */
        alert("localStorage no está soportado");
    }
};


//Se crea una clase para almacenar los errores en caso de que haya en el formulario de contacto.html

class CampoErroneo {
    campo;
    mensajeE;

    constructor(campo, mensajeE) {
        this.campo = campo;
        this.mensajeE = mensajeE;
    }
}

function comprobacionFormulario() {
    $errores = [];
    err = 0;
    console.log($errores)
    formularioNombre();
    formularioApellido();
    formularioRaza();
    formularioFecha();
    formularioLocalidad();
    formularioAreaTexto();
    console.log("formulario");
    console.log($errores)

    if (err == 0) {
        alert("Envio Correcto");
        const params = {
                        email: document.querySelector('#emailFormContac').value,
                        idRaza: document.querySelector('#razaFormContac').value,
                        idEspecie: document.querySelector('#especieFormContac').value ,
                        fechaEncontrado: new Date(document.querySelector('#fechaFormContac').value).toISOString().slice(0, -1),
                        localidad: document.querySelector('#localidadFormContac').value,
                        urlImg: document.querySelector('#imgForm').value,
                        estadoAnimal: document.querySelector('#validationTextarea').value
                }

                const xhr = new XMLHttpRequest();
                xhr.addEventListener("load",onRequestHandlerContacto);
                xhr.open('POST', 'http://localhost:8080/animales/animal');
                xhr.setRequestHeader('Content-type', 'application/json')
                xhr.setRequestHeader('access-control-allow-methods', 'GETPUTPOSTDELETEHEADOPTIONS')
                xhr.setRequestHeader('access-control-allow-origin', 'http://localhost:63342')
                xhr.send(JSON.stringify(params))
    } else {
        errorMensaje = "hay errores!!\n"
        $errores.map(function(obj) {
            console.log(obj.mensajeE)
            return errorMensaje += obj.mensajeE + "\n"
        })
        confirm(errorMensaje);
    }
}

function formularioNombre() {
    //nombre, le añadimos un atributo al html
    $("#nombreFormContac").attr('required', true);
    if ($("#nombreFormContac").val() == "") {
        //Almacenamos los errores
        err += 1;
        $errores.push(new CampoErroneo(`nombreFormContac ${err}`, `Debe estar cubierto el nombre`));
    }
}

function formularioApellido() {
    //apellidos, le añadimos un atributo al html
    $("#apellidoFormContac").attr('required', true);
    if ($("#apellidoFormContac").val() == "") {
        //Almacenamos los errores
        err += 1;
        $errores.push(new CampoErroneo(`apellidoFormContac ${err}`, `Debe estar cubierto los apellidos`));
    }
}
function formularioRaza() {
    //Raza, le añadimos un atributo al html
    $("#razaFormContac").attr('required', true);
    if ($("#razaFormContac").val() == "") {
        //Almacenamos los errores
        err += 1;
        $errores.push(new CampoErroneo(`razaFormContac ${err}`, `Debe estar cubierta la Raza`));
    }
}
function formularioFecha() {
    $("#fechaFormContac").attr('required', true);
    let patronFecha = /^([12]\d{3})[\/\-](((0)[0-9])|((1)[0-2]))[\/\-]([0-2][0-9]|(3)[0-1])$/;
    let fechaCorrecto = document.getElementById("fechaFormContac");
    let campoCorrectoFecha = fechaCorrecto.value.match(patronFecha);
    if (!campoCorrectoFecha) {
        err += 1;
        $errores.push(new CampoErroneo(`fechaFormContac ${err}`, `El formato de fecha tiene que ser aaaa-mm-dd ej: 1985/08/01`));
    }
}
function formularioLocalidad(){

    $("#localidadFormContac").attr('required', true);
    if ($("#localidadFormContac").val() == "") {
        //Almacenamos los errores
        err += 1;
        $errores.push(new CampoErroneo(`localidadFormContac ${err}`, `Debe estar cubierta la localidad`));
    }
}
function formularioAreaTexto(){
    $("#validationTextarea").attr('required', true);
     if ($("#validationTextarea").val() == "") {
            //Almacenamos los errores
            err += 1;
            $errores.push(new CampoErroneo(`validationTextarea ${err}`, `Debe estar cubierto el estado del animal`));
        }

}
//FOrmulario de identificación
function formularioIdentificacion() {

    $errores = [];
    err = 0;
    console.log($errores)
    correoLogin();
    nombreLogin();
    correoConfirmLogin();
    contrasenha();
    console.log("formulario");
    console.log($errores)

    if (err == 0) {
        alert("Envio Correcto");

        const params = {
                nombre: document.querySelector('#nombre').value,
                email: document.querySelector('#email').value,
                pass: document.querySelector('#password').value,
                tipoUsuario: 0
        }

        const xhr = new XMLHttpRequest();
        xhr.addEventListener("load",onRequestHandler);
        xhr.open('POST', 'http://localhost:8080/usuarios/usuario');
        xhr.setRequestHeader('Content-type', 'application/json')
        xhr.setRequestHeader('access-control-allow-methods', 'GETPUTPOSTDELETEHEADOPTIONS')
        xhr.setRequestHeader('access-control-allow-origin', 'http://localhost:63342')
        xhr.send(JSON.stringify(params))

    } else {
        errorMensaje = "hay errores!!\n"
        $errores.map(function(obj) {
            console.log(obj.mensajeE)
            return errorMensaje += obj.mensajeE + "\n"
        })
        confirm(errorMensaje);
    }
}
function nombreLogin() {
    //nombre, le añadimos un atributo al html
    $("#nombre").attr('required', true);
    if ($("#nombre").val() == "") {
        //Almacenamos los errores
        err += 1;
        $errores.push(new CampoErroneo(`nombreFormContac ${err}`, `Debe estar cubierto el nombre`));
    }
}
function correoLogin() {
    var re = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;
    var emailOK = document.getElementById("email");
    var eOK = emailOK.value.match(re);
    if (!eOK) {
        console.log(emailOK.value + ' El campo de emamil no es correcto');
        err += 1;
        $errores.push(new CampoErroneo("email", `${err}: El campo de emamil no es correcto`))
    }
}
function correoConfirmLogin() {
    var emailOK = document.getElementById("email");
    var confemailOK = document.getElementById("emailConfirm");
    if (emailOK.value != confemailOK.value) {
        eOK = null
    } else {
        eOK = !null
    };
    console.log(eOK);
    if (!eOK) {
            console.error(confemailOK.value + '  El campo de confirmación no es correcto');
        err += 1;
        $errores.push(new CampoErroneo("emailConfirm", `${err}: El campo de confirmación no es correcto`))
    }
}
function contrasenha(){
$("#password").attr('required', true);
    if ($("#password").val() == "") {
        //Almacenamos los errores
        err += 1;
        $errores.push(new CampoErroneo(`password ${err}`, `Debe estar cubierto la contraseña`));
    }
}
//Se crea un filter para las imagenes publicadas de este modo el usuario puede visualizar la raza que esté interesada

function cargarGaleria(){
    $(".filter-button").click(function(){
        var value = $(this).attr('data-filter');
        if(value == "todo"){
            $(".filter").show ('100');
        }else{
            $(".filter").not('.' + value).hide ('300');
            $(".filter").filter('.' + value).show('300');
        }
    });
    if ($(".filter-button").removeClass("active")){
        $(this).removeClass("active");
    }
    $(this).addClass("active")

}

//REQUEST

function onRequestHandler(){
if ( this.readyState == 4 && this.status == 200){
    const data = JSON.parse(this.response);
    console.log(data);
    localStorage.setItem("identidad", data.nombre);
}
}
function onRequestHandlerContacto(){
if ( this.readyState == 4 && this.status == 200){
    const data = JSON.parse(this.response);
    console.log(data);
}
}
