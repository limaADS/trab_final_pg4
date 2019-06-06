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
        <script type="text/javascript" src="js/materialize.js"></script>
    </head>

    <body>
        <script >
            document.addEventListener('DOMContentLoaded', function () {
                var elems = document.querySelectorAll('select');
                var instances = M.FormSelect.init(elems, options);
            });
        </script>
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
                <div class="col s4 offset-l4 card-content center light-blue lighten-5" id="card_Cad_Usuario" align="center">
                    <form class="col s8">
                        <h4>Cadastro do Produto</h4>
                        <div class="row">
                            <div class="input-field col s12">
                                <input placeholder="Nome do Produto" id="first_name" type="text" class="validate" name="nome_produto">
                                <label for="nome_produto"></label>
                            </div>
                            
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input placeholder="Descrição do Produto" id="first_name" type="text" class="validate" name="descricao">
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s4">
                                <input placeholder="Quantidade" id="first_name" type="text" class="validate" name="quantidade">
                                <label for="quantidade"></label>
                            </div>
                            <div class = "row col s4">               
                                <label>Data do Cadastro</label>              
                                <input type = "date" class = "datepicker" name="data_cadastro" />    
                            </div> 
                            <div class="input-field col s4">
                                <input placeholder="Preço" id="first_name" type="text" class="validate" name="preco">
                                <label for="preco"></label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s6">
                                <select name="id_categoria">
                                    <option value="0">Selecione o Caixa</option>
                                    <option value="1">Dia</option>
                                    <option value="2">Noite</option>
                                    <option value="3">Associação</option>
                                </select>
                                <label for = 'id_categoria'>Categoria</label>
                            </div>
                            <div class="input-field col s6">
                                <input placeholder="Ativo" id="email" type="email" class="validate" name="ativo">
                                <label for="ativo"></label>
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
        
        <script>
            var selectC = document.querySelectorAll('.')
            for (var i = 0; i < selectC.length; i++) {
                M.FormSelect.init(selectC[i]);
            }
        </script>
        
    </body>
</html>
