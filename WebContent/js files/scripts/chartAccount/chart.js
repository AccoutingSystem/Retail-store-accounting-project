
function createChartList(charts) {
    var self = this;
    self.chartAccList= ko.observable(charts);    
}

 var chartsOfAccountsModel = function()
{
    var self = this;
    self.chartList = ko.observableArray([]);
    self.type = [{ name: "Payable"},{name: "Receivable"}]; 
    
    self.chartcode = ko.observable();
    self.chartdescription = ko.observable();
    self.chosenchartType = ko.observable();

    
    
    var userObject = {
      
      chartCode: self.chartcode,
      chartDescription: self.chartdescription,
      chartType: self.chosenchartType    
    }
    
  //saving the account chart
    self.submit = function()
    {
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/AccountingERPSystem/rest/ChartOfAccounts/Save",
            data: ko.toJSON(userObject),
            contentType: 'application/json',
            dataType: 'json',
            success: function()
            {
                alert("Account Chart successfully added!!!");
                //empty properties here

            },
            error: function()
            {
                alert("Error!!Could not add");
                //empty properties here
                
            }
        });
    };
    
    //view charts
    self.view = function()
    {
        $.ajax({
            type: 'GET',
            url: '',
            contentType: 'application/json',
            dataType: "json",
            success: function(data)
            {
            	// debugger;
            	console.log(data);
              for (i = 0; i < data.length; i++)
               {
            	  self.chartList.push(new createChartList(data[i]));
               }   
            },
            error: function()
            {
                alert("error has occured");
            }
        });
    };
    
    // update chart   
    self.updateCustumerInfor = function()
    {
        $.ajax({
            type: 'POST',
            url: '',
            contentType: 'application/json',
            dataType: "json",
            success: function()
            {
               alert("update successful");
            // empty the properties
            },
            error: function()
            {
                alert("error has occured");
            }
        });
    };
    
    // search chart
    
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
