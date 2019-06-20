<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="Header.jsp"/>
    </head>
    <body class="homeimg">              
        <jsp:include page="i_nav.jsp"/>
        <%
            String id_produto = request.getParameter("id_produto");
        %>
        <div class="row">
            <div class="col s6 offset-s3 card">
                <form action="ProdutoControle?metodo=InserirFoto&id_produto=<%= id_produto%>" method="post" enctype="multipart/form-data" class="row">
                    <div class="file-field input-field col s9 center">
                        <h5>Selecione a foto do produto</h5> 
                        <br>
                        <br>
                        <div class="btn blue">
                            <span>Selecionar foto</span>
                            <input type="file" name="file" class="file-chos" id="file">
                        </div>
                        <div class="file-path-wrapper">
                            <input class="file-path validate"  type="text">
                        </div>
                    </div>
<!--                    <div class="col s3 right" style="margin-top: 20px;">
                        <img  class="fotoPerfil prev-img right">
                    </div>-->
                    <div class="row center">
                        <input type="submit" class="btn blue" value="Salvar"/>
                    </div>
                </form>

                <script>
                    const $ = document.querySelector.bind(document);
                    const previewImg = $('.prev-img');
                    const fileChooser = $('.file-chos');
                    fileChooser.onchange = e => {
                        const fileToUpload = e.target.files.item(0);
                        const reader = new FileReader();
                        reader.onload = e => previewImg.src = e.target.result;
                        reader.readAsDataURL(fileToUpload);
                    };
                </script>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>