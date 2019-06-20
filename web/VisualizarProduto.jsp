<%@page import="java.util.List"%>
<%@page import="Modelo.Categoria"%>
<%@page import="DAO.CategoriaDAO"%>
<%@page import="Modelo.Produto"%>
<%@page import="DAO.ProdutoDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="Header.jsp"/>
    </head>
    <body>
        <jsp:include page="i_nav.jsp"/>
        <br>
        <br> 
        <br>

        <%
            int id_produto = 999;
            String nome_produto = "";
            Double preco = 10.0;
            int quantidade = 1;
            String descricao = "";
            try {
                id_produto = Integer.parseInt(request.getParameter("id_produto"));
                ProdutoDAO dao = new ProdutoDAO();
                Produto produto = dao.pesquisaPorID(id_produto);
                nome_produto = produto.getNome_produto();
                descricao = produto.getDescricao();
                preco = produto.getPreco();
                CategoriaDAO cdao = new CategoriaDAO();
                Categoria categoria = new Categoria();
                List lista = cdao.listarTodas();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        %>
        <div class="row">
            <div class="col s6 offset-l3 card-content center" id="card_Cad_Usuario" align="center">
                <form action="ProdutoControle?metodo=insert"  method="post">
                    <h4>Editar produto</h4>
                    <div class="row">
                        <div class="input-field col s12">
                            <input  value="<%= nome_produto%>" type="text" class="validate" name="nome_produto">
                            <label>Nome do produto</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input value="<%= descricao%>"  type="text" class="validate" name="descricao">
                            <label>Descrição</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s2">
                            <input value="<%= quantidade%>"  type="number" class="validate" name="quantidade">
                            <label>Quantidade</label>
                        </div>
                        <div class="input-field col s4">
                            <input value="<%= preco%>"  type="number" class="validate" name="preco" min="0">
                            <label>Preço em R$</label>
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
        <jsp:include page="./footer.jsp"/>
    </body>
</html>
