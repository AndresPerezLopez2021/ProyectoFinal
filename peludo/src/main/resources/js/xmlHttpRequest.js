//XMLHttRequest

const xhr = new XMLHttpRequest();
function onRequestHandler(){
if ( this.readyState == 4 && this.status == 200){
    const data = JSON.parse(this.response);
    console.log(data);
    const HTMLResponse = document.querySelector ('#request');
    const mapaUser = data.map((user)=> '<li>${user.name}');
}
/*
xhr.addEventListener("load", onRequestHandler);
xhr.open('GET', 'http://localhost:8080/animals');
xhr.send();
*/
}
