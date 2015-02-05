<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Plateforme Silver@Home</title>
<script src="js/jquery.1.9.1.min.js"></script>
<!-- bootstrap just to have good looking page -->
<link href="bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet" />
<script src="js/displayData.js"></script>
</head>
<body>
	<!-- article inputs -->
	<div class="article" style="margin:10px;">
		<div class="input-prepend">
			<span class="add-on">ID</span>
			<input class="span4" id="id" name="id" type="text" placeholder="patient medical_id...">
		</div>
		<br/>
		<div class="input-prepend">
			<span class="add-on">WEIGHT</span>
			<input class="span4" id="weight" name="weight" type="text" placeholder="weight of patient..">
		</div>
		<br/>
		<div class="input-prepend">
			<span class="add-on">WEIGHT REFERENCE</span>
			<input class="span2" id="weightReference" name="weightReference" type="text" placeholder="weight specified by doctor for the patient...">
		</div>
		<br/>
		<div class="input-prepend">
			<span class="add-on">TENSION</span>
			<input class="span2" id="patientTension" name="patientTension" type="text" placeholder="Tension of patient...">
		</div>
		<br/>
		<div class="input-prepend">
			<span class="add-on">DATE OF MESURE</span>
			<input class="span2" id="dateOfMesure" name="dateOfMesure" type="text" placeholder="Date of taking the mesure...">
		</div>
		<p>
			<button class="btn btn-primary" type="button" onclick="sendAjax()">Add</button>
		</p>
	</div>
	
	
	
	<!-- display the content of database -->
	<div style="width:700px;padding:20px;S">
		<h5 style="text-align:center"><i style="color:#ccc"><small>Patients</small></i></h5>
	
		<table id="added-patientData" class="table">
			<tr>
				<th>Id</th>
				<th>Weight</th>
				<th>Weight reference</th>
				<th>Tension</th>
				<th>Date of mesure</th>
			</tr>
		</table>
	</div>
	
	<!-- 
		<h1>Silver at Home</h1>
	<ul>
		<li><a href="">Patient data</a></li>
		<li>Health performance</li>
	</ul>
	 -->
</body>
</html>