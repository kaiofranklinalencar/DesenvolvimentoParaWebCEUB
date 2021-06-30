	<!DOCTYPE html>
	<html>
	<head>
		<link rel="preconnect" href="https://fonts.gstatic.com">
		<link href="https://fonts.googleapis.com/css2?family=Raleway:wght@100&display=swap" rel="stylesheet">
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
					<form class="adicionacontato"  action="AdicionaContato" method="POST">
						Nome:	<input	type="text" name="nome"	/><br	/>
						CPF:	<input	type="text" name="cpf"	/><br	/>
						RG:	<input	type="text" name="rg"	/><br	/>
						Endereço:	<input	type="text" name="endereco"	/><br	/>
						Email:	<input	type="text" name="email"	/><br	/>
						Senha:	<input	type="text" name="senha"	/><br	/>
						<input	type="submit" value="Gravar"	/>
				</form>
					</div>
			</section><!--main-->
	</body>