<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="./Header.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="./navAdmin.jsp"></jsp:include> 
        <br>
        <br>
        <br>
        <div class="row">
            <div class="col s6 offset-l3 card-content center" id="card_Cad_Usuario" align="center">
                <form action="ProdutoControle?metodo=insert"  method="post">
                    <h4>Cadastro do Produto</h4>
                    <div class="row">
                        <div class="input-field col s12">
                            <input placeholder="Nome do Produto" id="first_name" type="text" class="validate" name="nome_produto">
                            <label for="nome_produto"></label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input placeholder="Descrição do Produto"  type="text" class="validate" name="descricao">
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s4">
                            <input placeholder="Quantidade"  type="number" class="validate" name="quantidade">
                            <label for="quantidade"></label>
                        </div>
                        <div class="input-field col s4">
                            <input placeholder="Preço"  type="number" class="validate" name="preco">
                            <label for="preco"></label>
                        </div>
                        <div class="col s4">
                            <label>Escolha a categoria</label>
                            <select class="browser-default" name="id_categoria">
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>

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
    </body>
</html>
