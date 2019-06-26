<%@page import="Modelo.Usuario"%>
<%@page import="DAO.RelatorioDAO"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Produto"%>
<%@page import="DAO.ProdutoDAO"%>
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
                <h4>Pesquisa de usuários que fizeram compras</h4>
                <form action="UsuarioControle?metodo=relUsuarioCompras" method="POST">
                    <div class="row">
                        <div class="input-field col s2 offset-l4">
                            <input  type="date" class="validate" name="dataA">
                        </div>
                        <div class="input-field col s2">
                            <input  type="date" class="validate" name="dataB">
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
                                    <th>NOME</th>
                                    <th>E-mail</th>
                                </tr>
                            </thead>
                            <%
                                System.out.println("fora do if");
                                if (request.getAttribute("Lista") != null) {
                                    System.out.println("Dentro do if");
                                    List<Usuario> lista = (List) request.getAttribute("Lista");
                                    for (Usuario us : lista) {
                            %>
                            <tr>
                                <td> <%=us.getNome_usuario()%> </td>
                                <td> <%=us.getEmail()%> </td>

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
    </body>
</html>
