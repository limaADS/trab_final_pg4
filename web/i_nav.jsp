<%
    String categoria = "";
    try {
        categoria = (String) session.getAttribute("categoria");
        System.out.println("Categoria do usuário: " + categoria);
        if (categoria == null) {
            categoria = "";
        }
        if (categoria.equals("cliente")) {
%>
<jsp:include page="navCliente.jsp"/>
<%
} else if (categoria.equals("adm")) {
%>
<jsp:include page="navADM.jsp"/>
<%
} else {
%>
<jsp:include page="nav.jsp"/>
<%
    }
%>


<%            } catch (Exception e) {
        System.out.println(e.getMessage());
    }
%>