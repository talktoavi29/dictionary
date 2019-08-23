<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="dictionary_project.css">
<meta name="viewport" id="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, viewport-fit=cover"></meta>
<title>index</title>
  </head>
  <body>
    <!--navbar-->
    <nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbarcontent">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="dictionary_project.html"><img src = "logo.png"></a>
        </div>
        <div class="collapse navbar-collapse" id="navbarcontent">
          <ul class="nav navbar-nav ml-auto">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Contact</a></li>
          </ul>
          <ul class = "nav navbar-nav navbar-right">
            <button type = "button" class = "btn btn-danger" name = "button">Log out</button>
            <!-- <li><input type = "text" name = "search" placeholder="search"></input></li> -->
          </ul>
        </div>
      </div>
    </nav>

<!--searchbar-->
<div class = "container">
  <div class =  "jumbotron">
    <h2>Welcome ${username} to this online dictionary.</h2>
<form action = "getword">
<input type = "text" name = "word" placeholder="Search here..." id = "searchbar"/>
<input type = "submit" id = "searchbutton" value = "search" class = "btn btn-success btn-lg"/>
</form>
</nav>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>

  </body>
</html>
