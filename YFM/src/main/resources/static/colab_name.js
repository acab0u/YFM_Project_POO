window.onload = async function() {
    try {
        let colaboradores = await $.ajax({ 
            url: "/api/colaboradores",
            method: "get",
            dataType: "json"
        });
        let html = "";
        for (let colab of colaboradores) {
            html+=`<section>
                    <h4>${colab.name}</h>
                    <p>${colab.mail}</p>
                    </section>`
        }
        document.getElementById("colaboradores").innerHTML = html;
    } catch(err) {
        console.log(err);
    }

async function showInfo_colab() {
    try {
        let name = document.getElementById("colaboradores").value;
        let colaboradores = await $.ajax({
            url: "/api/colaboradores/"+name,
            method: "get",
            dataType: "json"
        }
        );
        showInfo(colaboradores);
            
    } catch(err) {
        let elemMain = document.getElementById("colaboradores");
        console.log(err);
        elemMain.innerHTML = "<h1> Página não está disponível</h1>"+
                "<h2> Por favor tente mais tarde</h2>";}
    }
} 