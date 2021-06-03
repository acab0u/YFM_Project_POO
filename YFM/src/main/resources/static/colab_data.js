window.onload = async function () {
    try {
        let colaboradores = await $.ajax({
            url: "/api/colaboradores",
            method: "get",
            dataType: "json"
        });
        let html = "";
        for (let colab of colaboradores) {
            html += `<section onclick= openColabInfo(${colab.id})>
                    <h3>${colab.name}</h>
                    <p>${colab.mail}</p>
                    </section>`
        }
        document.getElementById("colaboradores").innerHTML = html;
    } catch (err) {
        console.log(err);
    }
}
function openColabInfo(id) {
    sessionStorage.setItem("colabId", id);
    window.location = "colab_info.html";
}

