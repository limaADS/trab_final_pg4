<%@page import="DAO.CestaDAO"%>
<%@page import="Modelo.Cesta"%>
<%@page import="Modelo.Produto"%>
<%@page import="java.util.List"%>
<%@page import="DAO.ProdutoDAO"%>
<%@page import="Controle.ProdutoControle"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="Header.jsp"/>
    <body>
        <jsp:include page="i_nav.jsp"/>
        <br>
        <%
            ProdutoDAO dao = new ProdutoDAO();
            CestaDAO cdao = new CestaDAO();
            String id_user = (String) session.getAttribute("id_usuario");
            List<Cesta> lista_cesta = cdao.listarTodas(id_user);
        %>
        <div class="row center-align">
            <form action="./VendaControle?metodo=venda" method="POST">
                <h5>Sua saúde em primeiro lugar! </h5>
                <div class="row">
                    <div class="col s11 right-align">
                        <input type="submit" class="btn blue" value="COMPRAR">
                    </div>
                </div>
                <br>
                <%
                    double valor = 0;
                    for (Cesta cesta : lista_cesta) {
                        Produto produto = dao.pesquisaPorID(cesta.getId_produto());
                        valor = valor + produto.getPreco();
                %>

                <div class="col s3">
                    <img src="./img/<%=produto.getFoto()%>" width="300px" height="300px">
                    <h5><%= produto.getNome_produto()%></h5>
                    <h6><%= produto.getDescricao()%></h6>
                    <h6>R$ <%= produto.getPreco()%></h6>
                    <h6>Estoque: <%= produto.getQuantidade()%></h6>
                    <div class="row">
                        <div class="input-field col s3 offset-l5">
                            <input value="1" class="validate" required placeholder="Quantidade" 
                                   type="number" class="validate" name="quantidade" min="1" max="<%= produto.getQuantidade()%>">
                            <label for="quantidade">Quantidade</label>
                            <input type="text" name="id_produto" value="<%= produto.getId_produto()%>" hidden="true"/>
                            <input type="number" class="valor" name="individualPreco" value="<%= produto.getPreco()%>" hidden="true"/>
                            <input type="text" name="id_cesta" value="<%= cesta.getId_cesta()%>" hidden="true"/>
                        </div>
                        <!--<a class="btn blue">ATualiza</a>-->
                    </div>
                </div>
                <% }%>

            </form>

        </div>


    </body>
</html>
