
function sendAjax() {
	// get inputs
	var patientData = new Object();
	patientData.patientID = $('#id').val();
	patientData.patientName = $('#name').val();
	patientData.patientWeight = $('#weight').val();
	patientData.perfectWeight = $('#weightReference').val();
	patientData.systolicPressure= $('#systolicPressure').val();
	patientData.diastolicPressure= $('#diastolicPressure').val();
	patientData.date = $('#dateOfMesure').val();
	
	$.ajax({
		url: "jsonservlet",
		type: 'POST',
		dataType: 'json',
		data: JSON.stringify(patientData),
		contentType: 'application/json',
		mimeType: 'application/json',
		
		success: function (data) {
        	$("tr:has(td)").remove();
        	console.log(data);
        },
		error:function(data,status,er) {
			alert("error: "+data+" status: "+status+" er:"+er);
		}
	});
}


function retrieveData(){
	
	var patientObject = {patientNumber : "", patientID : "", patientWeight : "", perfectWeight : "", systolicPressure : "", diastolicPressure : "",  date : "",  typeAlert : "" };
	$.ajax({
		url: "jsonservlet",
		type: 'GET',
		dataType: 'json',
		data: JSON.stringify(patientObject),
		contentType: 'application/json',
		mimeType: 'application/json',
		
		success: function (data) {
        	$("tr:has(td)").remove();
        	$.each(data, function (index, patientObject) {
                $("#added-patientData").append($('<tr/>')
                		.append($('<td/>').html(patientObject.date))
                		.append($('<td/>').html(patientObject.patientNumber))
                		.append($('<td/>').html(patientObject.patientID))
                		.append($('<td/>').html(patientObject.patientWeight))
                		.append($('<td/>').html(patientObject.perfectWeight))
                		.append($('<td/>').html(patientObject.systolicPressure))
                		.append($('<td/>').html(patientObject.diastolicPressure))
                		.append($('<td/>').html(patientObject.typeAlert))
                );  
            }); 
        },
        
		error:function(data,status,er) {
			alert("error: "+data+" status: "+status+" er:"+er);
		}
	});
}


function getPatient(id)
{

	console.log("Name to search --> "+id);
	var patientObject = {patientNumber : "", patientID : "", patientWeight : "", perfectWeight : "", systolicPressure : "", diastolicPressure : "",  date : "", typeAlert : "" };
	$.ajax({
		url: "jsonservlet",
		type: 'GET',
		dataType: 'json',
		data: {"patientID" : id},
		contentType: 'application/json',
		mimeType: 'application/json',
		
		success: function (data) {
			console.log(data);
        	$("tr:has(td)").remove();
        	$.each(data, function (index, patientObject) {
                $("#search-patientData").append($('<tr/>')
                		.append($('<td/>').html(patientObject.date))
                		.append($('<td/>').html(patientObject.patientNumber))
                		.append($('<td/>').html(patientObject.patientID))
                		.append($('<td/>').html(patientObject.patientWeight))
                		.append($('<td/>').html(patientObject.perfectWeight))
                		.append($('<td/>').html(patientObject.systolicPressure))
                		.append($('<td/>').html(patientObject.diastolicPressure))
                		.append($('<td/>').html(patientObject.typeAlert))
                );  
            }); 
        },
        
		error:function(data,status,er) {
			alert("error: "+data+" status: "+status+" er:"+er);
		}
	});
}


