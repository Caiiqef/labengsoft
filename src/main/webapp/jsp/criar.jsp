<!doctype html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Criar Usuarios</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/cover/">

    <!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/docs/4.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
  </head>
  <body class="text-center">
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="masthead mb-auto">
    <div class="inner">
      <h3 class="masthead-brand">APP SERVLET</h3>
      <nav class="nav nav-masthead justify-content-center">
        <a class="nav-link" href="/App Servlet/">HOME</a>
        <a class="nav-link active" href="/App Servlet/criar">CRIAR</a>
        <a class="nav-link" href="/App Servlet/atualizar">ATUALIZAR</a>
        <a class="nav-link" href="/App Servlet/listar">LISTAR</a>
        <a class="nav-link" href="/App Servlet/apagar">APAGAR</a>
      </nav>
    </div>
  </header>

  <main role="main" class="inner cover">
    <h1 class="cover-heading">Inserir dados da Doenca</h1>
    <!-- <p class="lead">Nome da Doenca:</p>
    <p class="lead">
      <input type="text" class="lead" id="nomeDoenca" name="nomeDoenca"><br>
    </p>
    <p class="lead">Sintomas da Doenca:</p>
    <p class="lead">
      <input type="text" class="lead" id="sintomasDoenca" name="sintomasDoenca"><br>
    </p>
    <p class="lead">
      <a href="#" class="btn btn-lg btn-secondary">Cadastrar</a>
    </p> -->
    <form method="post">
      <label for="nomeDoenca">Nome da Doenca:</label>
      <input type="text" id="nomeDoenca" name="nome"><br><br>
      <label for="sintomasDoenca">Sintomas da Doenca:</label>
      <input type="text" id="sintomasDoenca" name="sintomas"><br><br>
      <button type="submit" value="Submit">Cadastrar</button>
    </form>



    <p class="lead">Link para o Github do aluno - direto para este projeto:</p>
    <p class="lead">
      <a href="https://github.com/Caiiqef/labengsoft" class="btn btn-lg btn-secondary">Github</a>
    </p>
  </main>

  <footer class="mastfoot mt-auto">
    <div class="inner">
        <p>Projeto criado por <a href="https://www.github.com/caiiqef">Caique Fernandes</a>.</p>
    </div>
  </footer>
</div>
</body>
</html>
