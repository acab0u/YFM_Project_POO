window.onload = async function() {
    let colab = sessionStorage.getItem("colabId");
    await showColab(colab);
}

async function showEmpresa(id) {
    try {
        let empresa = await $.ajax({ 
            url: `/api/colaboradores/${id}`,
            method: "get",
            dataType: "json"
        });
        document.getElementById("emp_id").innerHTML = empresa.id;
        document.getElementById("emp_nome").innerHTML = empresa.name;
        document.getElementById("emp_contacto").innerHTML = empresa.contact;
        document.getElementById("emp_e-mail").innerHTML = empresa.mail;
        document.getElementById("emp_morada").innerHTML = empresa.address;
        document.getElementById("emp_localidade").innerHTML = empresa.local;
        
    } catch(err) {
        console.log(err);
    }
}
