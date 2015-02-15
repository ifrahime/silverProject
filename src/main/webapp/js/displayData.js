function sendAjax() {
 
	// get inputs
	var patientData = new Object();
	//patientData.id = $('#id').val();
	patientData.patientName = $('#name').val();
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
	var patientObject = {id : "", patientName : "", patientWeight : "", perfectWeight : "", patientTension : "", date : "", typeAlert : "" };
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
                		.append($('<td/>').html(patientObject.id))
                		.append($('<td/>').html(patientObject.patientName))
                		.append($('<td/>').html(patientObject.patientWeight))
                		.append($('<td/>').html(patientObject.perfectWeight))
                		.append($('<td/>').html(patientObject.patientTension))
                		.append($('<td/>').html(patientObject.date))
                		.append($('<td/>').html(patientObject.typeAlert))
                );  
            }); 
        },
        
		error:function(data,status,er) {
			alert("error: "+data+" status: "+status+" er:"+er);
		}
	});
}





