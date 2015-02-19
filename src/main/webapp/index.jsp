<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Silver@home - Doctor interface</title>

    <!-- Bootstrap Core CSS -->
    <link href="bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Timeline CSS -->
    <link href="dist/css/timeline.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="bower_components/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Doctor interface</a>
            </div>
            <!-- /.navbar-header -->
			
			<ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>Read All Messages</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>
                
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            
            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href="index.jsp"><i class="fa fa-dashboard fa-fw"></i>Home</a>
                        </li>
                        <li>
                            <a href="charts.jsp"><i class="fa fa-bar-chart-o fa-fw"></i>Charts</a>
                            <!-- /.nav-second-level -->
                        </li>
                        <li>
                            <a href="patientDetails.jsp"><i class="fa fa-edit fa-fw"></i>Forms</a>
                        </li>
                        <li>
                            <a href="login.jsp"><i class="fa fa-files-o fa-fw"></i>Login</a>
                            <!-- /.nav-second-level -->
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
            <div class="row">
            <!--<div class="col-lg-12">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            Silver@Home
                        </div>
                        <div class="panel-body">
                            <p>
                        		Le projet Silver@home propose d’étudier et de mettre en oeuvre une plate-forme digitale recueillant les données d’un patient de type sénior pour les transmettre de façon sécurisée aux personnels de santé. En effet, le patient se pèse et prend sa tension au moyen d’une balance et d’un tensiomètre connectés. Ces derniers transmettent leurs données par Bluetooth à un Raspberry ou à une box qui va adapter leurs formats et les envoyer aux serveurs d’AZNetwork. Une fois ces données récupérées, un traitement sera effectué et, en fonction des résultats, des alertes pourront être envoyées au médecin traitant. Ainsi, les médecins pourront établir un diagnostic à distance et suivre l’évolution de santé du patient depuis l'hôpital. Si une alerte est déclenchée, le médecin sera automatiquement mis au courant et aura la possibilité de contacter le patient.
                        	</p>
                        </div>
                        <div class="panel-footer">
                            <img  class="img-responsive" alt="silverSchema" src="http://nsm08.casimages.com/img/2015/02/17//15021704590919166812975951.png">
                        </div>
                    </div>
                </div>
                -->
                <div class="col-lg-12">
                    <div class="jumbotron">
                        <h1>Silver@Home</h1>
                        <p>
                        	Le projet Silver@home propose d’étudier et de mettre en oeuvre une plate-forme digitale recueillant les données d’un patient de type sénior pour les transmettre de façon sécurisée aux personnels de santé. En effet, le patient se pèse et prend sa tension au moyen d’une balance et d’un tensiomètre connectés. Ces derniers transmettent leurs données par Bluetooth à un Raspberry ou à une box qui va adapter leurs formats et les envoyer aux serveurs d’AZNetwork. Une fois ces données récupérées, un traitement sera effectué et, en fonction des résultats, des alertes pourront être envoyées au médecin traitant. Ainsi, les médecins pourront établir un diagnostic à distance et suivre l’évolution de santé du patient depuis l'hôpital. Si une alerte est déclenchée, le médecin sera automatiquement mis au courant et aura la possibilité de contacter le patient.
                        </p>
                        <br/>
                        <img  class="img-responsive" alt="silverSchema" src="http://nsm08.casimages.com/img/2015/02/17//15021704590919166812975951.png">
                        <br/>
                    </div>
                </div>
               
            </div>
                        
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="dist/js/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="dist/js/metisMenu.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="dist/js/raphael-min.js"></script>
    <script src="dist/js/morris.min.js"></script>
    

    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>

</body>

</html>
