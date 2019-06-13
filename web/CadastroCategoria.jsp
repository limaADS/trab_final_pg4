<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="./Header.jsp"/>
    </head>
    <body>
        <jsp:include page="./navAdmin.jsp"></jsp:include>
        <br>
        <br>
        <br>
        <div class="row">
            <div class="col s6 offset-l3 card-content center" id="card_Cad_Usuario" align="center">
                <form action="CategoriaControle?metodo=insert" method="post">
                    <h4>Cadastro de Categoria</h4>
                    <div class="row">
                        <div class="input-field col s12">
                            <input placeholder="Nome da Categoria" type="text" name="nome_categoria">
                        </div>  
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input placeholder="Descri��o da Categoria" type="text" name="descricao">
                        </div>
                    </div> 
                    <div class="row">
                        <div>
                            <div class="input-field col s3 center">
                                <a href="#" class="btn red darken-2 ">Cancelar</a>
                            </div>
                            <div class="input-field col s3 center">
                                <input type="submit" value="Salvar" class="btn green">
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>

