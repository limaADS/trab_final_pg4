<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="./Header.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="./navADM.jsp"></jsp:include> 
        <br>
        <br>
        <br>
        <div class="row">
            <div class="col s6 offset-l3 card-content center" id="card_Cad_Usuario" align="center">
                <form action="ProdutoControle?metodo=insert"  method="post">
                    <h4>Cadastro do Produto</h4>
                    <div class="row">
                        <div class="input-field col s12">
                            <input class="validate" required placeholder="Nome do Produto" id="nome_produto" type="text" class="validate" name="nome_produto">
                            <label for="nome_produto">Nome do Produto</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input class="validate" required placeholder="Descrição do Produto"  type="text" class="validate" name="descricao">
                            <label for="descricao">Descrição do Produto</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s4">
                            <input  class="validate" required placeholder="Quantidade"  type="number" class="validate" name="quantidade">
                            <label for="quantidade">Quantidade</label>
                        </div>
                        <div class="input-field col s4">
                            <input placeholder="Preço"  type="number" class="validate" name="preco" min="0" >
                            <label for="preco">Preço</label>
                        </div>
<!--                        <div class="col s4">
                            <label>Escolha a categoria</label>
                            <select class="browser-default" name="id_categoria">
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>
                        </div>-->
                    </div>


                    <div class="row">
                        <div>
                            <div class="input-field col s3 center">
                                <a href="PainelADM.jsp" class="btn red darken-2 ">Cancelar</a>
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
