<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Categoria"%>
<%@page import="java.util.List"%>
<%@page import="DAO.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <form class="col s12">
                    <h4>Lista de Categorias</h4>
                    <div class="row">
                        <div class="col s10 offset-l1 card-content center " id="card_Cad_Usuario" align="center">
                            <table class="striped  bordered striped centered " >
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>NOME</th>
                                        <th>DESCRIÇÃO</th>
                                        <th>DATA DO CADASTRO</th>
                                        <th>ATIVO</th>
                                        <th></th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>

                                    <%
                                        List<Categoria> listaDeClientes = (List<Categoria>) request.getAttribute("lista");
                                        CategoriaDAO dao = new CategoriaDAO();
                                        List<Categoria> lista = dao.listarTodas();

                                        Iterator i = lista.iterator();
                                        while (i.hasNext()) {
                                            Categoria categoria = (Categoria) i.next();
                                    %>
                                    <tr>
                                        <td><%= categoria.getId_categoria()%></td>
                                        <td><%= categoria.getNome_categoria()%></td>
                                        <td><%= categoria.getDescricao()%></td>
                                    </tr>

                                    <% }%>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <footer class="page-footer blue">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h5 class="white-text">Autor: Luis Henrique Delcul</h5>

                    </div>

                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">? 2019 Instituto Federal Farroupilha - Campus
                    S?o Vicente do Sul</div>
            </div>
        </footer>
    </body>
</html>