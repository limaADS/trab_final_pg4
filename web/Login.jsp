<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="./Header.jsp"/>
        <title>Farmácia</title>
    </head>
    <body>
        <jsp:include page="./nav.jsp"/>
        <br>
        <br>
        <br>
        <div class="row">
                <div class="col s4"></div>
                <div class="col s4 card-content center white light-5" id="card-login">
                    <h4>Identifique-se</h4>
                    <div class="row">
                        <form class="col s10 offset-l1" action="./Controle/usuarioPDO.php?function=login" method="post">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">email</i>
                                <input id="icon_prefix" type="email" name="email" class="validate" required="treu">
                                <label for="icon_prefix">E-mail</label>
                            </div>
                            <div class="input-field col s12">
                                <i class="material-icons prefix">security</i>
                                <input id="icon_senha" type="password" name="senha" class="validate" required="true">
                                <label for="icon_senha">Senha</label>
                            </div>
                            <div class="red-text">
                                
                            </div>
                            <a href="./View/Usuario/cadastroUsuario.php" class="btn green darken-2">Resgistr-se</a> 
                            <input type="submit" value="Entrar" class="btn blue corpadrao">
                        </form>
                    </div>
                </div>
                <div class="col s4"></div>
            </div>
    </body>
</html>
