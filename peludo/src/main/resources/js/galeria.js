window.onload=cargarGaleria;

function cargarGaleria(){
    $(".filter-button").click(function(){
        var value = $(this).attr('data-filter');
        if(value == "todo"){
            $(".filter").show ('10');
        }else{
            $(".filter").not('.' + value).hide ('30');
            $(".filter").filter('.' + value).show('30');
        }
    });
    if ($(".filter-button").removeClass("active")){
        $(this).removeClass("active");
    }
    $(this).addClass("active")

}