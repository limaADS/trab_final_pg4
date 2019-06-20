<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="./Header.jsp"/>
    </head>
    <body>
        <jsp:include page="./i_nav.jsp"/>
        <br>
        <br>
        <br>
        <div class="row">
            <div class="col s6 offset-l3 card-content center" id="card_Cad_Usuario" align="center">
                <form action="CategoriaControle?metodo=insert" method="post">       
                    <h4>Cadastro de Categoria</h4>
                    <div class="row">
                        <div class="input-field col s12">
                            <input required class="validate" placeholder="Nome da Categoria" type="text" name="nome_categoria">
                            <label>Nome da Categoria</label>
                        </div>  
                    </div>
                    <div class="row">
                        <div class="input-field col s12">   
                            <input required class="validate" placeholder="Descrição da Categoria" type="text" name="descricao">
                            <label>Descrição</label>
                        </div>  
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
    </div>
</body>
</html>

