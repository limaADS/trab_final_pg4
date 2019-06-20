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
        <jsp:include page="i_nav.jsp"/>
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
                                        for (Categoria categoria : lista) {
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
        <div class="row">
            <div class="center-align">
                <div class="input-field col s3 center"> 
                    <a href="PainelADM.jsp" class="btn red darken-2 ">Cancelar</a>
                </div>
                <div class="input-field col s3 center">
                    <input type="submit" value="Salvar" class="btn green">
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>