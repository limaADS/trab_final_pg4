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
        <%
            ProdutoDAO dao = new ProdutoDAO();
            List<Produto> lista = dao.listarTodas();
        %>
        <div class="row center-align">
            <h5>Detales do Produto! </h5>
            <br>
            <%
                Produto produto = new Produto();
                produto = dao.pesquisaPorID(id_produto);
            %>
            <div class="col s12">

                <img src="./img/<%=produto.getFoto()%>" width="300px" height="300px">

                <h5><%= produto.getNome_produto()%></h5>
                <h6><%= produto.getDescricao()%></h6>
                <h6>R$ <%= produto.getPreco()%></h6>
                <h6>Estoque: <%= produto.getQuantidade()%></h6>
                

                <a href="CestaControle?metodo=add_cesta&id_produto=<%=produto.getId_produto()%> ">Add Cesta</a>
            </div>

        </div>
        <jsp:include page="./footer.jsp"/>
    </body>
</html>
