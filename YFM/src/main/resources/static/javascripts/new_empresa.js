async function AddEmpresa() {
    try {
        let empresa = {
            name: document.getElementById("name").value,
            mail: document.getElementById("mail").value,
            contact: document.getElementById("contact").value,
            address: document.getElementById("address").value,
            local: document.getElementById("local").value,
            nif: document.getElementById("nif").value,
        }
        console.log(JSON.stringify(empresa));
        let result = await $.ajax({
            url: "/api/empresas",
            method: "post",
            dataType: "json",
            data:JSON.stringify(empresa),
            contentType: "application/json"
        });
            console.log(JSON.stringify(result));
            window.alert("Empresa registada com sucesso!");
        } catch(err) {
            console.log(err);
            alert("Por favor, insira os dados corretamente!")
        }
}