
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags-->
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Register Forms</title>

    <!-- Icons font CSS-->
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/main.css" rel="stylesheet" media="all">

</head>

<body>
    <div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
        <div class="wrapper wrapper--w780">
            <div class="card card-3">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Registration Info</h2>
                    <form id="register-form" action="/login" method="post" >
                        <div class="input-group">
                            <input minlength="3" maxlength="20"  class="input--style-3" type="text" placeholder="FullName" name="FullName" required/>
                      
                        </div>
                        <div class="input-group">
                            <input minlength="3" maxlength="15" class="input--style-3" type="text" placeholder="UserName" name="username" required/>
                            
                        </div>
                        <div class="input-group">
                            <input pattern="[a-zA-Z0-9]+" oninput="setCustomValidity(''); checkValidity(); setCustomValidity(validity.valid ? '' :'Only alphanumeric passwords are allowed');" class="input--style-3" type="password" placeholder="Password" id="password" name="password" required/>
                            
                        </div>
                        <div class="input-group">
                            <input minlength="10" maxlength="40"  class="input--style-3" type="Text" placeholder="Address" name="Address" required/>
  
                        </div>
                        <div class="input-group">
                            <input  class="input--style-3" type="number" placeholder="Contact" name="Contact" required/>
                        
                        </div>
                        <div class="input-group">
                            <input minlength="6" maxlength="18" class="input--style-3" type="Text" placeholder="City" name="City" required/>
                  
                        </div>
                        <div class="p-t-10">
                            <input class="btn btn-primary" type="submit" value="Sign up" >
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js/global.js"></script>
    

</body>
</html>