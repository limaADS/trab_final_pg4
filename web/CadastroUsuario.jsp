<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
              rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"
              media="screen,projection" />

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </head>

    <body>
        <nav class="blue">
            <div class="nav-wrapper">
                <a href="#" class="brand-logo center">Farma Vida</a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="sass.html"></a></li>
                    <!--                 <li><a href="badges.html">Components</a></li> -->
                    <!--                 <li><a href="collapsible.html">JavaScript</a></li> -->
                </ul>
            </div>
        </nav>


        <br>
        <br>
        <br>
        <form>
            <div class="row">
                <div class="col s6 offset-l3 card-content center  lighten-5" id="card_Cad_Usuario" align="center">
                    <form class="col s10">
                        <h4>Cadastro de Usuário</h4>
                        <div class="row">
                            <div class="input-field col s8">
                                <input placeholder="Nome Completo" id="first_name" type="text" class="validate" name="nome_usuario">
                                <label for="nome_usuario"></label>
                            </div>
                            <div class = "row col s4">               
                                <label>Data de Nascimento</label>              
                                <input type = "date" class = "datepicker" name="data_nascimento" />    
                            </div> 
                        </div>
                        <div class="row">
                            <div class="input-field col s4">
                                <input placeholder="RG" id="first_name" type="text" class="validate" name="rg">
                                <label for="rg"></label>
                            </div>
                            <div class="input-field col s4">
                                <input placeholder="CPF" id="first_name" type="text" class="validate" name="cpf">
                                <label for="cpf"></label>
                            </div>
                            <div class="input-field col s4">
                                <input placeholder="Telefone" id="first_name" type="text" class="validate" name="telefone">
                                <label for="telefone"></label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s9">
                                <input placeholder="Endereço" id="first_name" type="text" class="validate" name="endereco">
                                <label for="endereco"></label>
                            </div>
                            <div class="input-field col s3">
                                <input placeholder="Sexo" id="first_name" type="text" class="validate" name="sexo">
                                <label for="sexo"></label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input placeholder="E-mail" id="email" type="email" class="validate" name="email">
                                <label for="email"></label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s6">
                                <input placeholder="Senha" id="password" type="password" class="validate" name="senha">
                                <label for="password"></label>
                            </div>
                            <div class="input-field col s6">
                                <input  placeholder="Verifica Senha" id="password" type="password" class="validate">
                                <label for="password"></label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s10  right-align">
                                <button class="waves-effect waves-light btn  blue-grey" type="submit" name="action">
                                    Cancelar <i class=" center-align "></i>
                                </button>
                            </div>
                            <div class="input-field col s2 right-align">
                                <button class="waves-effect waves-light btn blue" type="submit" name="action">
                                    Salvar <i class=" center-align "></i>
                                </button>
                            </div>

                        </div>

                    </form>
                </div>
            </div>
        </form>


        <footer class="page-footer blue">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h5 class="white-text">Autor: Luis Henrique Delcul</h5>

                    </div>

                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">? 2019 Instituto Federal Farroupilha - Campus
                    S?o Vicente do Sul</div>
            </div>
        </footer>


        
        

    </body>
</html>