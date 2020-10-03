<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
<head>
  <title>NITW Mess Management Portal</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!---- BootStrap Libraries         -->
  <link rel="stylesheet" href="/static/css/bootstrap.min.css">
  <script src="/static/js/jquery.min.js"></script>
  <script src="/static/js/bootstrap.min.js"></script>
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   
 <style>
 
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
   background-color:#101B2D;
      font-family: Georgia, Times, "Times New Roman", serif;
    
    }

     .navbar1 {
      margin-bottom: 0;
      border-radius: 0;

      font-family: Georgia, Times, "Times New Roman", serif;
    }
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 130%;

    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #3b3b3b;
    font-size:15px;
      color: #b3b3b1;
      padding: 15px;
    font-family: Georgia, Times, "Times New Roman", serif;
    }
  footer a:hover
  {
  text-decoration:none;
  color:white;
  }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  .intropara
  {
  font-size:16px;

  text-align:justify;
  }
  
 body{
    font-family: Georgia, Times, "Times New Roman", serif;

   }
}
  </style>
  </head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
<h1 class="text-center"> 
<a class="pull-left" href="/"> 
<img class="img-responsive" style="vertical-align: bottom;" src="logo.png" alt="pict logo"/>
</a><span style="margin-left: -20%; color: rgb(222, 222, 222);">NITW Mess Management Portal</span></h1>  
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      
    </div>
     
      <ul class="nav navbar-nav navbar-right">
        <li><a href="regtiser.html"><span class="glyphicon glyphicon-user"></span> Register</a></li>
        <li><a href="loging.html"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
        
      </ul>
    </div>
  </div>
</nav>
<div style="background-image: url('hostel_mess.jpg'); background-repeat: no-repeat; background-attachment: fixed;
  background-size: 100% 100%;">
<div class="container-fluid ">    
  <div class="row content">
    <div class="col-sm-2 sidenav ">
    
    </div>

    <div class="col-sm-8 text-left" style="padding-left:40px;padding-right:40px;">
      <h1 class="text-center"><b>Welcome</b></h1>
      <br>
      <h2>Mess Portal NITW</h2>
      <hr>
    </div>
    <div class="col-sm-2 sidenav">
    </div>
  </div>
</div>
</div>
<footer class="container-fluid text-center">
<div>� 2020-2021 NITW, All rights reserved.<br/>
<!-- <p><a href="/developers-page/">Developers</a></p></div>  -->
</footer>
</body>
</html>
