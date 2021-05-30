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
                    <h2>${colab.name}</h>
                    <p>${colab.mail}</p>
                    </section>`
        }
        document.getElementById("colaboradores").innerHTML = html;
    } catch(err) {
        console.log(err);
    }
}