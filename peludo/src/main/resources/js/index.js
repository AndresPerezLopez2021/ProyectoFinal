window.onload = cargaPagina;

function cargaPagina(){

    leerLocalStorage();

   document.getElementById("sidebar").style.maxWidth = "325px";
   document.getElementById("claro").addEventListener("click", claro);
   document.getElementById("oscuro").addEventListener("click", oscuro);
  // document.getElementById('enviar').addEventListener("click", comprobacionFormulario);



    
}
//Ingreso del usuario

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
    console.log("formulario");
    console.log($errores)

    if (err == 0) {
        alert("Envio Correcto");
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
    //nombre, le añadimos un atributo al html
    $("#razaFormContac").attr('required', true);
    if ($("#razaFormContac").val() == "") {
        //Almacenamos los errores
        err += 1;
        $errores.push(new CampoErroneo(`razaFormContac ${err}`, `Debe estar cubierto la Raza`));
    }
}


function formularioFecha() {
    $("#fechaFormContac").attr('required', true);
    let patronFecha = /^([0-2][0-9]|(3)[0-1])[\/\-](((0)[0-9])|((1)[0-2]))[\/\-]([12]\d{3})$/;
    let fechaCorrecto = document.getElementById("fechaFormContac");
    let campoCorrectoFecha = fechaCorrecto.value.match(patronFecha);
    if (!campoCorrectoFecha) {
        err += 1;
        $errores.push(new CampoErroneo(`fechaFormContac ${err}`, `El formato de fecha tiene que ser aaaa-mm-dd ej: 1985/08/01`));
    }
}
function cargarGaleria(){
    $(".filter-button").click(function(){
        var value = $(this).attr('data-filter');
        if(value == "todo"){
            $(".filter").show ('1000');
        }else{
            $(".filter").not('.' + value).hide ('3000');
            $(".filter").filter('.' + value).show('3000');
        }
    });
    if ($(".filter-button").removeClass("active")){
        $(this).removeClass("active");
    }
    $(this).addClass("active");

}