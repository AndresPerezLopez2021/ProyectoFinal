window.onload = cargaPagina;

function cargaPagina(){
    document.getElementById("sidebar").style.maxWidth = "325px";
    document.getElementById("claro").addEventListener("click", claro);
    document.getElementById("oscuro").addEventListener("click", oscuro);
    import i18n from './i18n/i18n';
}
