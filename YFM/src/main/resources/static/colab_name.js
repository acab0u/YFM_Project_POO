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
        document.getElementById("colabname").innerHTML = colab.name;
        document.getElementById("name").innerHTML = colab.name;
        document.getElementById("contacto").innerHTML = colab.contact;
    } catch(err) {
        console.log(err);
    }
}
