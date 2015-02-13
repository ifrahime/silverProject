function sendAjax() {
 
	// get inputs
	var patientData = new Object();
	patientData.id = $('#id').val();
	patientData.patientWeight = $('#weight').val();
	patientData.perfectWeight = $('#weightReference').val();
	patientData.patientTension= $('#patientTension').val();
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
	var patientData = {id : "", patientWeight : "", perfectWeight : "", patientTension : "", date : "", typeAlert : "" };
	$.ajax({
		url: "jsonservlet",
		type: 'GET',
		dataType: 'json',
		data: JSON.stringify(patientData),
		contentType: 'application/json',
		mimeType: 'application/json',
		
		success: function (data) {
        	$("tr:has(td)").remove();
        	$.each(data, function (index, patientData) {
                $("#added-patientData").append($('<tr/>')
                		.append($('<td/>').html(patientData.id))
                		.append($('<td/>').html(patientData.patientWeight))
                		.append($('<td/>').html(patientData.perfectWeight))
                		.append($('<td/>').html(patientData.patientTension))
                		.append($('<td/>').html(patientData.date))
                		.append($('<td/>').html(patientData.typeAlert))
                );  
            }); 
        },
        
		error:function(data,status,er) {
			alert("error: "+data+" status: "+status+" er:"+er);
		}
	});
}

