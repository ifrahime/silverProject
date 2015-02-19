<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Silver@home - Doctor interface</title>
    
    <!-- Bootstrap Core CSS -->
    <link href="dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="dist/css/metisMenu.min.css" rel="stylesheet">

    <!-- Timeline CSS -->
    <link href="dist/css/timeline.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="dist/css/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="dist/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
	<script src="js/displayData.js"></script>
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
                <div class="col-lg-12">
                    <h1 class="page-header">Patient information</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
	             <div class="col-lg-12">
	                    <div class="panel panel-default">
	                        <div class="panel-heading">
	                            Select patient data
	                        </div>
	                        <!-- /.panel-heading -->
	                        <div class="panel-body">
		                        <form class="form-inline">
								  <div class="form-group">
								    <label for="patientID">ID</label>
								    <input type="text" id="patientID" name="patientID" class="form-control" placeholder="Search for this ID"> 
								  </div>
								  <button type="button" class="btn btn-primary btn-xs" onclick="getPatient(document.getElementById('patientID').value)">Search</button>
								  <button type="button" class="btn btn-default btn-xs" onclick="drawChart(document.getElementById('patientID').value)">Chart</button>
								 </form>
							    <br/>
	                           	<div class="table-responsive">
	                                    <table id="search-patientData" class="table table-striped table-bordered table-hover">
											<tr>
												<th>Date of mesure</th>
												<th>N°</th>
												<th>Id</th>
												<th>Weight</th>
												<th>Weight reference</th>
												<th>systolicPressure</th>
												<th>diastolicPressure</th>
												<th>Alert</th>
											</tr>
									   </table>
								</div>
	                        </div>
	                        <!-- /.panel-body -->
	                    </div>
	                    <!-- /.panel -->
	                </div>
	                <!-- /.col-lg-12 -->
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            weight chart
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                           <div class="flot-chart">
                                <div id="myCharts"></div>
                            </div>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    
       
	</div>
	 <!-- jQuery -->
    <script src="dist/js/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="dist/js/metisMenu.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="dist/js/raphael-min.js"></script>
    <script src="dist/js/morris.min.js"></script>
    <script src="js/weightChart.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>
	 
</body>
</html>