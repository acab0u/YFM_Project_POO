window.onload = async function () {
    let empresa = sessionStorage.getItem("empresaId");
    let colab = sessionStorage.getItem("colabId");
    await ShowViaturas(empresa);
    await ShowColab(colab);
}
async function ShowColab(id){
    let colab = await $.ajax ({
        url: `/api/colaboradores/${id}`,
        method: "get",
        dataType: "json"
    });
    document.getElementById("id").innerHTML = colab.id;
}
async function ShowViaturas(empresaId){
    try {
        let viaturas = await $.ajax({
            url: `/api/viaturas/empresa/${empresaId}`,
            method: "get",
            dataType: "json"
        });
        let html="";
        for (let viatura of viaturas) {
            html+= "<option value=" + viatura.id + ">" + viatura.matricula + " - " + viatura.nome + " " + viatura.modelo + "</option>";
            }
        document.getElementById("viaturas_list").innerHTML = html;
        
    } catch (err) {
        console.log(err);    
    }
}
async function addRegisto_saida() {
    try {
        let viatura = {
            colab_id: sessionStorage.getItem("colabId"),
            viatura_id: document.getElementById("viaturas_list").value,
            dia_saida: document.getElementById("data_saida").value,
            quilometros_saida: document.getElementById("quilometros_saida").value,
        }
        console.log(JSON.stringify(viatura));
        sessionStorage.setItem("viaturaId",viatura.id);
        
        let result = await $.ajax({
            url: "/api/registo_saidas",
            method: "post",
            dataType: "json",
            data:JSON.stringify(viatura),
            contentType: "application/json"
        });
        console.log(JSON.stringify(result));
        window.alert("Registo de saída efetuado com sucesso!");
        window.location = "colab_info.html";
    } catch(err) {
        console.log(err);
        alert("Dados incorretos! Por favor, tente novamente!")
    }
}
