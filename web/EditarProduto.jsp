<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%@page import="Modelo.Categoria"%>
<%@page import="DAO.CategoriaDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Produto"%>
<%@page import="DAO.ProdutoDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="Header.jsp"/>
    </head>
    <body>
        <jsp:include page="nav.jsp"/>
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
//                if (session.getAttribute("id") != null) {
//                    int id = (int) session.getAttribute("id");
//                    System.out.println("AQUI EDITAR" + id);
//                } else {
//                    System.out.println("aaaa");
//                }
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
                    <h4>Cadastro do Produto</h4>
                    <div class="row">
                        <div class="input-field col s12">
                            <input  value="<%= nome_produto%>" type="text" class="validate" name="nome_produto">
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s12">
                            <input value="<%= descricao%>"  type="text" class="validate" name="descricao">
                        </div>
                    </div>
                    <div class="row">
                        <table>
                            <tr>
                                <td><div class="col s1">Quantidade</div></td>
                                <td><div class="input-field col s2">
                                        <input value="<%= quantidade%>"  type="number" class="validate" name="quantidade">
                                    </div></td>
                            </tr>
                        </table>
                        <div class="input-field col s4">
                            <input value="<%= preco%>"  type="number" class="validate" name="preco" min="0">
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
        <%--<jsp:include page="./footer.jsp"/>--%>
    </body>
</html>