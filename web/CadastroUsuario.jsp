<%-- 
    Document   : CadastroUsuario
    Created on : 04/06/2019, 18:12:06
    Author     : 2017000879
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastrar Cliente</h1>
        <!--<form action="./Controle/" method="post">-->
        <form action="UsuarioControle?metodo=inserir" method="post">
            <label> Nome: </label>
            <input type="text" name="nome_usuario" /><br>
            <!--            <label> Data de Nascimento: </label>
                        <input type="text" name="nascimento" /><br>
                        <label> Endereço: </label>
                        <input type="text" name="endereco" /><br>
                        <label> Cidade: </label>
                        <input type="text" name="cidade" /><br>
                        <label> Status </label>
                        <input type="text" name="status" /><br>-->
            <br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
