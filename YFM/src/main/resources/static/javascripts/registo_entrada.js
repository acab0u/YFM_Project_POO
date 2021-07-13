window.onload = async function () {
    
    let colab = sessionStorage.getItem("colabId");
    let viatura = sessionStorage.getItem("viatura_id");
    await ShowColab(colab);
    await ShowViatura(viatura);
}
async function ShowColab(id){
    let colab = await $.ajax ({
        url: `/api/colaboradores/${id}`,
        method: "get",
        dataType: "json"
    });
    document.getElementById("id").innerHTML = colab.id;
}
async function ShowViatura(id){
        let viatura = await $.ajax({
            url: `/api/viaturas/${id}`,
            method: "get",
            dataType: "json"
        });
        document.getElementById("id").innerHTML = viatura.id;
}
async function addRegisto_entrada() {
    try {
        let viatura = {
            colab_id: sessionStorage.getItem("colabId"),
            viatura_id: sessionStorage.getItem("viatura_id"),
            dia_saida: document.getElementById("data_entrada").value,
            quilometros_saida: document.getElementById("quilometros_entrada").value,
            quilometros:document.getElementById("viaturaId")
        }
        console.log(JSON.stringify(viatura));
        let result = await $.ajax({
            url: "/api/registo_entradas",
            method: "post",
            dataType: "json",
            data:JSON.stringify(viatura),
            contentType: "application/json"
        });
        console.log(JSON.stringify(result));
        window.alert("Registo de saída efetuado com sucesso!");
    } catch(err) {
        console.log(err);
        alert("Dados incorretos! Por favor, tente novamente!")
    }
}
