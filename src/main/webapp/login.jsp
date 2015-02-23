<html>
   
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Login page</title>

    <!-- Bootstrap Core CSS -->
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="dist/css/metisMenu.min.css" rel="stylesheet">

    <!-- Timeline CSS -->
    <link href="dist/css/timeline.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="dist/css/font-awesome.min.css" rel="stylesheet" type="text/css">
</head>

    <body>
	     <div class="container">
	        <div class="row">
	            <div class="col-md-4 col-md-offset-4">
	                <div class="login-panel panel panel-default">
	                    <div class="panel-heading">
	                        <h3 class="panel-title">Please Sign In</h3>
	                    </div>
	                    <div class="panel-body">
	                        <form role="form" method="POST" action="${pageContext.request.contextPath}/loginservlet">
	                            <fieldset>
	                                <div class="form-group">
	                                    <input class="form-control" placeholder="E-mail" name="email" type="email" autofocus>
	                                </div>
	                                <div class="form-group">
	                                    <input class="form-control" placeholder="Password" name="password" type="password" value="">
	                                </div>
	                                <!-- Change this to a button or input when using this as a form -->
	                                <button class="btn btn-success" type="submit">Login</button>
	                            </fieldset>
	                        </form>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	    <!--
        <h1><center><font color="BLUE">LOGIN PAGE</font></center> </h1>
        <form method="POST" action="${pageContext.request.contextPath}/loginservlet">

            <table border="0" align="center">
                <thead>
                    <tr>
                        <th>email Name :</th>
                        <th><input type="text" name="email" value="" /></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Password :</td>
                        <td><input type="password" name="password" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
        -->
        
        <!-- jQuery -->
    <script src="dist/js/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="dist/js/metisMenu.min.js"></script>
    
    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>
        
        
    </body>
</html>