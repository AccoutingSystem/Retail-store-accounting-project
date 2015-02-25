
function createChartList(charts) {
    var self = this;
    self.chartAccList= ko.observable(charts);    
}

 var chartsOfAccountsModel = function()
{
    var self = this;
    self.chartList = ko.observableArray([]);
    
    //self.type = [{ name: 'Payable'},{name: 'Receivable'}];
    self.type = ['Payable','Receivable'];
    
    self.chartcode = ko.observable();
    self.chartdescription = ko.observable();
    self.chosenchartType = ko.observable();

    var chartObject = {
    		chartCode: self.chartcode,
    		chartDescription: self.chartdescription,
    		chartType: self.chosenchartType    
    }
    
  //saving the account chart nn
    self.submit = function()
    {
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/AccountingERPSystem/rest/ChartOfAccounts/Save",
            data: ko.toJSON(chartObject),
            contentType: 'application/json',
            dataType: 'json',
            success: function()
            {
                alert("Account Chart successfully added!!!");
                console.log(ko.toJSON(chartObject));
                //empty properties
            },
            error: function()
            {
                alert("Error!!Could not add");
                console.log(ko.toJSON(chartObject));
              //empty properties here   
            }
        });
    };
    
    //view charts
    self.view = function()
    {
        $.ajax({
            type: 'GET',
            url: 'http://localhost:8080/AccountingERPSystem/rest/ChartOfAccounts/Retrieve', 
            contentType: 'application/json',
            dataType: "json",
            success: function(data)
            {
          
            	//chartAccList : JSON.parse(data)
            
            	// debugger;
            	console.log(data);
            	//alert(data.chartDescription);
            	//console.log(ko.toJSON(data));
              for (i = 0; i < data.length; i++)
               {
            	  self.chartList.push(new createChartList(data[i]));
            	  //alert(data[i].chartDescription);
               }   
            },
            error: function()
            {
                alert("Error has occured!!!");
            }
        });
    };
  
    // update chart   
    self.updateCustumerInfor = function()
    {
        $.ajax({
            type: 'PUT',
            url:"http://localhost:8080/AccountingERPSystem/rest/ChartOfAccounts/Update",
            data: ko.toJSON(chartObject),
            contentType: 'application/json',
            dataType: "json",
            success: function()
            {
               alert("Update successful!!!");
            // empty the properties
            },
            error: function()
            {
                alert("Error has occured!!!");
             // empty the properties
            }
        });
    };
    
 // search chart
	self.search = function()
	{
		$.ajax({
			type: 'GET',
			url: "http://localhost:8080/AccountingERPSystem/rest/ChartOfAccounts/Search?key="+self.chartcode(),
			contentType: 'application/json',
			dataType: "json",
			success: function(data)
			{
				//chartAccList : JSON.parse(data)
				// debugger;
				console.log(data);
				console.log(ko.toJSON(data));
				for (i = 0; i < data.length; i++)
				{
					self.chartList.push(new createChartList(data[i]));
				}   
			},
			error: function()
			{
				alert("Error has occured!!!");
			}
		});
	};
    
    //delete chart
    self.deleteChart = function() {
        $.ajax({
            url: '',
            cache: false,
            type: 'DELETE',
            contentType: 'application/json; charset=utf-8',
            data: {},
            success: function() {
                alert("deleted");
            }
        }).fail(
                function(xhr, textStatus, err) {
                    alert(err);
                });
    };
    
    
};

$(document).ready(function()
  {
      var model = new chartsOfAccountsModel();
      ko.applyBindings(model);
  });
