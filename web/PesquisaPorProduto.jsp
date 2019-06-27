<%@page import="DAO.ProdutoDAO"%>
<%@page import="Modelo.Produto"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="Header.jsp"/>
    </head>
    <body>
        <jsp:include page="i_nav.jsp"/>
    </body>
    <br>
    <br>
    <br>
    <div class="row">
        <div class="col s10 offset-l1 card-content center " id="card_Cad_Usuario" align="center">
            <h4>Produtos comprados por data</h4>
            <form action="ProdutoControle?metodo=relUsuariosProdutos" method="POST">
                <div class="row">
                    <div class="col s4 offset-l3">
                        <select class="browser-default" name="id_produto">
                            <%
                                ProdutoDAO dao = new ProdutoDAO();
                                List<Produto> listaProdutos = dao.listarTodasPlus();
                                for (Produto p : listaProdutos) {

                            %>

                            <option value="<%=p.getId_produto()%>"> <%=p.getNome_produto()%> </option>
                            <%  }
                            %>
                        </select>
                    </div>
                    <div class="input-field col s3 center">
                        <input type="submit" value="Pesquisar" class="btn blue">
                    </div>
                </div>
            </form>
            <div class="row">
                <div class="col s10 offset-l1 card-content center " id="card_Cad_Usuario" align="center">
                    <table class="striped  bordered striped centered " >
                        <thead>
                            <tr>
                                <th>Nome do cliente</th>
                                <th>Preço</th>
                                <th>Data da Venda</th>
                            </tr>
                        </thead>
                        <%
                            System.out.println("fora do if");
                            if (request.getAttribute("Lista") != null) {
                                System.out.println("Dentro do if");
                                List<Usuario> lista = (List) request.getAttribute("Lista");
                                for (Usuario us: lista) {
                        %>
                        <tr>
                            <td><%=us.getNome_usuario() %></td>
                            <td><%=us.getEmail() %></td>
                            <td><%=us.getData_nascimento() %> </td>
                        </tr>

                        <%
                                }
                            }

                        %>

                        <tbody>

                        </tbody>
                    </table>
                    <div class="row">
                        <div>
                            <div class="input-field col s3 center"> 
                                <a href="PainelADM.jsp" class="btn red darken-2 ">Voltar</a>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
</html>
