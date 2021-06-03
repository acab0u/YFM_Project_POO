window.onload = async function() {
    let colabtId = sessionStorage.getItem("colabId");
    await showColabInfo(colabId);
}

async function showColabInfo(id) {
    try {
        let colab = await $.ajax({ 
            url: `/api/colaboradores/${id}`,
            method: "get",
            dataType: "json"
        });
        document.getElementById("ColabName").innerHTML = colab.name;
        document.getElementById("e_mail").innerHTML = colab.mail;
        document.getElementById("contacto").innerHTML = colab.contacto;
        document.getElementById("morada").innerHTML = colab.morada;
        document.getElementById("localidade").innerHTML = colab.localidade;
    } catch(err) {
        console.log(err);
    }
}
