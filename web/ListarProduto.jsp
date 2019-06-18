<%@page import="Modelo.Produto"%>
<%@page import="DAO.ProdutoDAO"%>
<%@page import="java.util.List"%>
<%@page import="Controle.ProdutoControle"%>
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
        <div class="row">
            <div class="col s10 offset-l1 card-content center " id="card_Cad_Usuario" align="center">

                <%
                    ProdutoDAO dao = new ProdutoDAO();
                    List<Produto> lista = dao.listarTodas();
                %>

                <h4>Lista de Produtos</h4>
                <div class="row">
                    <div class="col s10 offset-l1 card-content center " id="card_Cad_Usuario" align="center">
                        <table class="striped  bordered striped centered " >
                            <thead>
                                <tr>
                                    <th>NOME</th>
                                    <th>DESCRIÇÃO</th>
                                    <th>PREÇO</th>
                                    <th>ESTOQUE</th>
                                    <th>DATA DE CADASTRO</th>
                                    <th>ATIVO</th>
                                    <th>Editar</th>
                                    <th>ID</th>
                                    <th></th>
                                </tr>
                            </thead>

                            <tbody>
                                <%
                                    for (Produto produto : lista) {
                                %>
                                <tr>
                                    <td><%= produto.getNome_produto()%></td>
                                    <td><%= produto.getDescricao()%></td>
                                    <td>R$<%= produto.getPreco()%></td>
                                    <td><%= produto.getQuantidade()%></td>
                                    <td><%=produto.getData_cadastro()%></td> 
                                    <td><% if (produto.getAtivo() == 1) {
                                        %>
                                        SIM
                                        <%
                                        } else {
                                        %>
                                        NÂO
                                        <%
                                            }%>
                                    <td><a href="EditarProduto.jsp?id_produto=<%= produto.getId_produto() %>">Editar</td>

                                    <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>