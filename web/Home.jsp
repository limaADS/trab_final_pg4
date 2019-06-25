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
            List<Produto> lista = dao.listarTodas();
        %>
        <div class="row center-align">
            <h5>Sua saúde em primeiro lugar! </h5>
            <br>
            <br>
            <br>
            <%
                for (Produto produto : lista) {

            %>

            <div class="col s3">
                <img src="./img/<%=produto.getFoto()%>" width="300px" height="300px">
                <h5><%= produto.getNome_produto()%></h5>
                <h6><%= produto.getDescricao()%></h6>
                <h6>R$ <%= produto.getPreco()%></h6>
                <h6>Qtdd: <%= produto.getQuantidade()%></h6>
                <a href="CestaControle?metodo=add_cesta&id_produto=<%=produto.getId_produto()%> ">Add Cesta</a>
            </div>
            <% }%>
        </div>
    </div>
</div>
</body>
</html>
