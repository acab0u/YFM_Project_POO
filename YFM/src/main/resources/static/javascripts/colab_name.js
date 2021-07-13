window.onload = async function() {
    let colab = sessionStorage.getItem("colabId");
    await showColab(colab);
    await showEmpresa(colab);
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
async function showEmpresa(id) {
    try {
        let empresa = await $.ajax({ 
            url: `/api/empresas/colaborador/${id}`,
            method: "get",
            dataType: "json"
        });
        document.getElementById("emp_id").innerHTML = empresa.id;
        document.getElementById("emp_nome").innerHTML = empresa.name;
        document.getElementById("emp_contacto").innerHTML = empresa.contact;
        document.getElementById("emp_e-mail").innerHTML = empresa.mail;
        document.getElementById("emp_morada").innerHTML = empresa.address;
        document.getElementById("emp_localidade").innerHTML = empresa.local;
        sessionStorage.setItem("empresaId",empresa.id);
    } catch(err) {
        console.log(err);
    }
}