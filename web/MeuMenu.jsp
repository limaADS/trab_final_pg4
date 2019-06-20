<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="Header.jsp"/>
    </head>
    <body>
        <jsp:include page="i_nav.jsp"/>
        <div class="row">
            <div class="col s6 offset-l3 card-content lighten-5" id="card_Cad_Usuario">
                <form class="col s12" action="UsuarioControle?metodo=insert" method="post">
                    <div class="center-align"><h4>Cadastre-se</h4></div>
                    <div class="row">
                        <div class="input-field col s8">
                            <input  required placeholder="Nome Completo" id="nome_usuario" type="text" class="validate" name="nome_usuario">
                            <label for="nome_usuario">Nome Completo</label>
                        </div>
                        <div class = "col s4">               
                            <label>Data de Nascimento</label>              
                            <input  required type = "date" class = "datepicker" name="data_nascimento" />    
                        </div> 
                    </div>
                    <div class="row">
                        <div class="input-field col s4">
                            <input required placeholder="RG" id="rg" class="validate" type="number" name="rg">
                            <label for="rg">RG</label>
                        </div>
                        <div class="input-field col s4">
                            <input required placeholder="CPF" id="cpf" type="number" class="validate" name="cpf">
                            <label for="cpf">CPF</label>
                        </div>
                        <div class="input-field col s4">
                            <input required placeholder="Telefone" id="telefone" type="number" class="validate" name="telefone">
                            <label for="telefone">Telefone</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s9">
                            <input required placeholder="Endereço" id="endereco" type="text" class="validate" name="endereco">
                            <label for="endereco">Endereço</label>
                        </div>
                        <div class="col s3">
                            <select class="browser-default" name="sexo">
                                <option value="M" >Maculino</option>
                                <option value="F">Feminino</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input required placeholder="E-mail" id="email" type="email" class="validate" name="email">
                            <label for="email">E-mail</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input required placeholder="Senha" id="senha" type="password" class="validate" name="senha">
                            <label for="Senha">Senha</label>
                        </div>
                        <div class="input-field col s6">
                            <input  required placeholder="Verifica senha" id="senha2" type="password" class="validate" name="senha2">
                            <label for="senha2">Verifica senha</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="row">
                            <div>
                                <div class="input-field col s3 center">
                                    <a href="Home.jsp" class="btn red darken-2 ">Cancelar</a>
                                </div>
                                <div class="input-field col s3 center">
                                    <input type="submit" value="Salvar" class="btn green">
                                </div>
                            </div>
                        </div>

                    </div>

                </form>
            </div>
        </div>
        <script>
            M.AutoInit();
        </script>


    </body>
</html>
