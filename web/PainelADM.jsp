<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="Header.jsp"/>
    </head>
    <body>
        <jsp:include page="i_nav.jsp"/>
        <div class="row">
            <div class="col s4 offset-l4 center-align ">
                <ul class="collapsible">    

                    <li>
                        <div class="collapsible-header"><i class="material-icons">filter_drama</i>Produto</div>
                        <div class="collapsible-body"><a href="CadastroProduto.jsp">Cadastro Produto</a></div>
                        <div class="collapsible-body"><a href="ListarProduto.jsp">Listar Produto</a></div>
                    </li> 
                    <li>
                        <div class="collapsible-header"><i class="material-icons">filter_drama</i>Relatório</div>
                        <div class="collapsible-body"><a href="UsuariosCompraram.jsp">Usuários que efetuaram compras</a></div>
                        <div class="collapsible-body"><a href="ProdutosComprados.jsp">Produtos comprados por data</a></div>
                        <div class="collapsible-body"><a href="PesquisaPorProduto.jsp">Pesquisa por produto</a></div>
                    </li>
                </ul>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
        <script>
            M.AutoInit();
        </script>

    </body>
</html>
