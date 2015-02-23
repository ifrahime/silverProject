


function drawChart(id) {
	$("#chartdiv").html("");
	console.log("Draw chart for this person : "+id);
	var chart = AmCharts.makeChart("chartdiv", {
	    "theme": "none",	
	    "type": "serial",
			"autoMargins": false,
			"marginLeft":8,
			"marginRight":8,
			"marginTop":10,
			"marginBottom":26,
	    "pathToImages": "http://www.amcharts.com/lib/3/images/",
	    "dataProvider": chartData,
	    "valueAxes": [{
	        "id":"v1",
	        "axisAlpha": 0,
	        "inside": true
	    }],
	    "graphs": [{
	    	"bullet": "square",
	        "bulletBorderAlpha": 1,
	        "bulletBorderThickness": 1,
	        "fillAlphas": 0.3,
	        "fillColorsField": "lineColor",
	        "legendValueText": "[[value]]",
	        "lineColorField": "lineColor",
	        "title": "PatientWeight",
	        "valueField": "weight"
	    }],
	    "chartScrollbar": {
	    },
	    "chartCursor": {
	        "valueLineEnabled":true,
	        "valueLineBalloonEnabled":true
	    },
	    "categoryField": "date",
	    "categoryAxis": {
	        "parseDates": true,
	        "axisAlpha": 0,
	        "minHorizontalGap":60
	    }
	});
	
	var chartData=[];
	var patientObject = {patientNumber : "", patientID : "", patientWeight : "", perfectWeight : "", systolicPressure : "", diastolicPressure : "", date : "", typeAlert : "" };
	
	// Fire off an AJAX request to load the data
     $.ajax({
            url: "jsonservlet",
            type: 'GET',
            dataType: 'json',
            data: {"patientID" : id},
            contentType: 'application/json',
            mimeType: 'application/json',
        })
        .done(function( data ) {
          // When the response to the AJAX request comes back render the chart with new data
        	  //chart.setData(data);
        	  $.each(data, function (index, patientObject) {
        		  var alert=patientObject.typeAlert;
        		  console.log("AlertType : "+patientObject.typeAlert);
        		  var color=null;
        		  if(alert==="YELLOW ALERT")
    			  {
        			console.log("Yellow");
    			  	color="#F7FE2E";
    			  }else if(alert==="ORANGE ALERT")
    				  {
    				   console.log("orange");
    				   color="#FF8000";
    				  }else if(alert==="RED ALERT")
    					  {
    					    console.log("red")
    					  	color="#FF0000";
    					  }else if(alert===null)
    						  {
    						  console.log("other!");
    						  color="#40FF00";
    						  }
        		  chartData.push({
        	            weight: patientObject.patientWeight,
        	            date: patientObject.date,
        	            lineColor : color
        	        });
        	  });
        	  console.log("show data : "+chartData);
        	  chart.dataProvider=chartData;
        	  chart.validateData();
        })
        .fail(function() {
          // If there is no communication between the server, show an error
          alert( "error occured" );
        });
     
	chart.addListener("dataUpdated", zoomChart);
	
	function zoomChart(){
	  if(chart.zoomToIndexes){
	    chart.zoomToIndexes(130, chartData.length - 1);
	  }
	}
};
