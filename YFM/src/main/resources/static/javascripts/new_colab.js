window.onload = async function() {
    try {
        let empresas = await $.ajax({
            url: "/api/empresas",
            method: "get",
            dataType: "json"
        });
        let html="";
        for (let empresa of empresas) {
            html+= "<option value=" + empresa.id + ">" + empresa.name +  "</option>";
            }
        document.getElementById("empresa").innerHTML = html;
    } catch (err) {
        console.log(err);    
    }
    
}
async function addColab() {
    try {
        let colab = {
            name: document.getElementById("name").value,
            empresaId: document.getElementById("empresa").value,
            mail: document.getElementById("mail").value,
            contact: document.getElementById("contact").value,
            address: document.getElementById("address").value,
            local: document.getElementById("local").value,
            username: document.getElementById("username").value,
            password: document.getElementById("password").value,
        
        }
        console.log(JSON.stringify(colab));
        let result = await $.ajax({
            url: "/api/colaboradores",
            method: "post",
            dataType: "json",
            data:JSON.stringify(colab),
            contentType: "application/json"
        });
        console.log(JSON.stringify(result));
        window.alert("Utilizador registado com sucesso!");
    } catch(err) {
        console.log(err);
        alert("Por favor, insira os dados corretamente!")
    }
}