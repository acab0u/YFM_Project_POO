async function login() {
    try {
        let name = document.getElementById("colab_username").value;
        let pass = document.getElementById("colab_password").value;
        let colabs = await $.ajax({ 
            url: `/api/colaboradores/login/${name}/${pass}`,
            method: "get",
            dataType: "json"
        });
        if (colabs.length > 0) {
            sessionStorage.setItem("colabId",colabs[0].id);
            window.location = "colab_info.html";
        } else {
            alert("nome de utilizador ou palavra-passe incorretos! Tente de novo.")
        }

    } catch(err) {
        console.log(err);
    }

}