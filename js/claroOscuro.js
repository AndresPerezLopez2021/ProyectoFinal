/**
  se quiere dar un estilo escogido por un usuario. Se tiene en cuanta que hoy en día dependiendo del horario o del estilo de cada persona puede querer que una página web sea
  mas clara o mas oscura, por ello se ofrece estas dos opciones.
 */

function claro(){
    document.getElementById('tema').href ='css/claro.css';
    document.getElementById("imagenOscuro").src='./img/perroForm.jpg';
    //alamcenamos en una variable de sesión
    sessionStorage.setItem('tema', 'css/claro.css');
}

function oscuro(){
    document.getElementById('tema').href ='css/oscuro.css';
    document.getElementById("imagenOscuro").src='./img/gatoOscuro.jpg';
    //alamcenamos en una variable de sesión
    sessionStorage.setItem('tema', 'css/oscuro.css');    
}
