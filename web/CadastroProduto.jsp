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
            <div class="col s6 offset-l3 card-content center  lighten-5" id="card_Cad_Usuario" align="center">
                <form class="col s8" method="post" action="ProdutoControle?metodo=inserir   ">
                    <h4>Cadastro do Produto</h4>
                    <div class="row">
                        <div class="input-field col s12">
                            <input placeholder="Nome do Produto" id="first_name" type="text" class="validate" name="nome_produto">
                            <label for="nome_produto"></label>
                        </div>

                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input placeholder="Descrição do Produto" id="first_name" type="text" class="validate" name="descricao">
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s4">
                            <input placeholder="Quantidade" id="first_name" type="number" class="validate" name="quantidade">
                            <label for="quantidade"></label>
                        </div>
                        <div class = "row col s4">               
                            <label>Data do Cadastro</label>              
                            <input type = "date" class = "datepicker" name="data_cadastro" />    
                        </div> 
                        <div class="input-field col s4">
                            <input placeholder="Preço" id="first_name" type="number" class="validate" name="preco">
                            <label for="preco"></label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <select name="id_categoria">
                                <option value="0">Selecione o Caixa</option>
                                <option value="1">Dia</option>
                                <option value="2">Noite</option>
                                <option value="3">Associação</option>
                            </select>
                            <label for = 'id_categoria'>Categoria</label>
                        </div>
                        <div class="input-field col s6">
                            <input placeholder="Ativo" id="email" type="email" class="validate" name="ativo">
                            <label for="ativo"></label>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s10  right-align">
                            <button class="waves-effect waves-light btn  blue-grey" type="submit" name="action">
                                Cancelar <i class=" center-align "></i>
                            </button>
                        </div>
                        <div class="input-field col s2 right-align">
                            <button class="waves-effect waves-light btn blue" type="submit" name="action">
                                Salvar <i class=" center-align "></i>
                            </button>
                        </div>

                    </div>

                </form>
            </div>
        </div>
    </body>
</html>
