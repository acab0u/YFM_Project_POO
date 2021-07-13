window.onload = async function () {
    try {
        let empresas = await $.ajax({
            url: "/api/empresas/utilizador",
            method: "get",
            dataType: "json"
        });
        let html = "";
        for (let empresa of empresas) {
            html += `<section onclick= openEmpresaInfo(${empresa.id})>
                    <h3>${empresa.name}</h>
                    </section>`
        }
        document.getElementById("Empresas").innerHTML = html;
    } catch (err) {
        console.log(err);
    }
}
function openEmpresaInfo(id) {
    sessionStorage.setItem("empresaId", id);
    window.location = "empresa_info.html";
}