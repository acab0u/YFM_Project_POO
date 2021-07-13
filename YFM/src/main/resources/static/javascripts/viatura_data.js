window.onload = async function () {
    let empresa = sessionStorage.getItem("empresaId");
    await ShowViaturas(empresa);
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
            html+= "<option value=" + viatura.id + ">" + viatura.matricula + " - " + viatura.nome + " " + viatura.modelo + "-"+ viatura.quilometros+ " KMs" +"</option>";
            }
        document.getElementById("viaturas").innerHTML = html;
        
    } catch (err) {
        console.log(err);    
    }
}
