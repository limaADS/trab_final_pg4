<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
              rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"
              media="screen,projection" />

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <script type="text/javascript" src="js/materialize.js"></script>
    </head>

    <body>
        <jsp:include page="./navAdmin.jsp"></jsp:include>
        <br>
        <br>
        <br>
        <div class="row">
            <div class="col s4 offset-l4 card-content center" id="card_Cad_Usuario" align="center">
                <form class="col s8" action="CategoriaControle?metodo=inserir">
                    <h4>Cadastro da Categoria</h4>
                    <div class="row">
                        <div class="input-field col s12">
                            <input placeholder="Nome da Categoria" id="first_name" type="text" class="validate" name="nome_categoria">
                            <label for="nome_produto"></label>
                        </div>  
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input placeholder="Descrição da Categoria" id="descricao" type="text" class="validate" name="descricao">
                        </div>
                    </div> 
                    <div class="row">
                        <div class="center-align">
                            <div class="input-field col s3 center">
                                <a href="#" class="btn red darken-2 ">Cancelar</a>
                            </div>
                            <div class="input-field col s3 center">
                                <input type="submit" value="Salvar" class="btn green">
                            </div>
                        </div>
                    </div>
            </div>
        </div>
    </div>
</form>



</body>
</html>

