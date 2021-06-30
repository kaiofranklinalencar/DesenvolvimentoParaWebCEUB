<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <link rel="preconnect" href="https://fonts.gstatic.com"> 
    <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@100&display=swap" rel="stylesheet">
    <link href="/resources/css/style.css" rel="stylesheet" />
    <link href="style.css" rel="stylesheet" />
</head>
<body>
    <script src="https://kit.fontawesome.com/a86ab39c2a.js" crossorigin="anonymous"></script>
        <header>
            <div class="center">
                <div class="logo">
                    <h1>Núcleo de Pessoa Jurídica</h1>
                    <h3>Sistema de Agendamentos</h3>
                </div><!--cabeçalho-->
                <div class="menu">
                    <a href="#">
                        Home
                    </a>
                    <a href="#">
                        Sobre
                    </a>
                    <a href="#">
                        Contato
                    </a>
                    <a href="#">
                        Ajuda
                    </a>
              <!--      <a class="btn-menu" href="#">
                    ID: 010101
                    </a>   --->
                </div><!--menu horizontal-->
            </div><!--center-->
        </header>

        <section class="main">
                <div class="center">

                <a class="main_cta">
                    <h2>Primeiro Cadastro</h2>    
                    <p>Para se cadastrar na plataforma preencha todos os dados corretamente   
                    </p>
                </a>

                </div><!--center-->
				<form action="AdicionaContato" method="POST">           
                    <label> Nome: </label>  
                    <input type="text" class="nome" placeholder="Ex.: Maria Joaquina de Andrade" required>
                </div><!--NOME-->

                <div class="selecionecpf" action="AdicionaContato" method="POST">
                    <label> CPF:  </label>  
                    <input type="text" class="selecionecpf" placeholder="Ex.: 000.000.000-00" required>
                </div><!--SELECIONE CPF-->

                <div class="rg" action="AdicionaContato" method="POST">
                    <label>RG:</label>
                    <input type="text" class="rg" placeholder="Ex.: 3.227.144" required>
                </div>

                <div class="residencia" action="AdicionaContato" method="POST">
                    <label>Endereço:</label>
                    <input type="text" class="residencia" placeholder="Ex.: Cidade Estrutural" required>

                </div>
                
                <div class="emailprimeiroacesso" action="AdicionaContato" method="POST">
                    <label>Email:</label>
                    <input type="text" class="emailprimeiroacesso" placeholder="Ex.: mariajoaquina123@dominio.com">

                </div>
                <div class="senhanova" action="AdicionaContato" method="POST">
                    <label>Senha:</label>
                    <input type="text" class="senhanova" placeholder="Ex.: 86542731" required>
                </div>

                <div class="termoaceite" action="AdicionaContato" method="POST">
                    <label><input type="checkbox"> 
                        <a>
                            Declaro não ter condições, depois arrumar este texto blablabla
                        </a>
                        
                    </label>
                </div>

                <div class="btn-cadastro">
                    <button type="submit">Cadastrar</button>
                </div>
                				<input	type="submit" value="Gravar"	/>
						</form>
						

					<h1>Adiciona	Contatos</h1>
					<hr	/>
					<form	action="AdicionaContato" method="POST">
							Nome:	<input	type="text" name="nome"	/><br	/>
							CPF:	<input	type="text" name="cpf"	/><br	/>
							RG:	<input	type="text" name="rg"	/><br	/>
							Endereço:	<input	type="text" name="endereco"	/><br	/>
							Email:	<input	type="text" name="email"	/><br	/>
							Senha:	<input	type="text" name="senha"	/><br	/>
							<input	type="submit" value="Gravar"	/>
					</form>

</body>
</html>
						
                
        </section><!--main-->
</body>