$(function() {
    var patientData = {id : "", patientName : "", patientWeight : "", perfectWeight : "", patientTension : "", date : "", typeAlert : "" };
    var chart=Morris.Line({
          // ID of the element in which to draw the chart.
          element: 'myCharts',
          // Chart data records -- each entry in this array corresponds to a point on
          // the chart.
         
          // The name of the data record attribute that contains x-values.
          xkey: 'date',
          // A list of names of data record attributes that contain y-values.
          ykeys: ['patientWeight'],
          // Labels for the ykeys -- will be displayed when you hover over the
          // chart.
          labels: ['patientWeight']
        });

        // Fire off an AJAX request to load the data
     $.ajax({
            url: "jsonservlet",
            type: 'GET',
            dataType: 'json',
            data: JSON.stringify(patientData),
            contentType: 'application/json',
            mimeType: 'application/json',
        })
        .done(function( data ) {
          // When the response to the AJAX request comes back render the chart with new data
          chart.setData(data);
          console.log("Data received : "+data);
        })
        .fail(function() {
          console.log("Data received : "+data);
          // If there is no communication between the server, show an error
          alert( "error occured" );
        });

});
