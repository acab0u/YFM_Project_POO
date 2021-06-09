window.onload = async function() {
    let colab = sessionStorage.getItem("colabId");
    await showColab(colab);
}


async function showColab(id) {
    try {
        let colab = await $.ajax({ 
            url: `/api/colaboradores/${id}`,
            method: "get",
            dataType: "json"
        });
        document.getElementById("id").innerHTML = colab.id;
        document.getElementById("colab_nome").innerHTML = colab.name;
        document.getElementById("nome").innerHTML = colab.name;
        document.getElementById("contacto").innerHTML = colab.contact;
        document.getElementById("e-mail").innerHTML = colab.mail;
        document.getElementById("colab_morada").innerHTML = colab.address;
        document.getElementById("localidade").innerHTML = colab.local;
        
    } catch(err) {
        console.log(err);
    }
}
