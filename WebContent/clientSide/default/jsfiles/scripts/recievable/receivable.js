function createReceivableList(receivable) {
    var self = this;
    self.List=ko.observable(receivable);    
}
var accountsPayableModel = function()
{
    var self = this;
    self.receivableList = ko.observableArray([]);
    
    self.receivablefolioNr = ko.observable();
    self.receivableAmount = ko.observable();
    self.receivableDate = ko.observable();
    self.receivableType = ko.observable();
    self.chartcode = ko.observable();
    
    self.totalReceivable = ko.computed(function() {
        var total = 0;
        for (var i = 0; i < self.receivableList().length; i++)
            total += self.receivableList()[i].List().amount;
        return total;
     }); 
    
    var userObject = {
    		folioNr: self.receivablefolioNr,
    		amount: self.receivableAmount,
    		receivablesDate: self.receivableDate,
    		receivableType: self.receivableType,
    		c: self.chartcode
    }
    

    self.submit = function()
    {
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/AccountingERPSystem/rest/AccountsReceivable/Save",//?payable="+userObject+"&chartId="+self.chartcode(),
            data: ko.toJSON(userObject),
            contentType: 'application/json',
            dataType: 'json',
            success: function()
            {
                alert("Payable account successfully added!!!"); 
            },
            error: function(data)
            {
            	//debugger;
                alert("Error!!!Could not add");
                console.log(ko.toJSON(userObject));    
            }
        });
    };
    
    //view payable
    self.view = function()
    {
        $.ajax({
            type: 'GET',
            url: 'http://localhost:8080/AccountingERPSystem/rest/AccountsReceivable/Retrieve',
            contentType: 'application/json',
            dataType: "json",
            success: function(data)
            {
            	// debugger;
            	console.log(data);
              for (i = 0; i < data.length; i++)
               {
            	  self.receivableList.push(new createReceivableList(data[i]));
               }   
            },
            error: function()
            {
                alert("Error has occured!!!");
            }
        });
    };
    
 // update receivable  
	self.updateReceivableInfor = function()
	{
		$.ajax({
			type: 'PUT',
			url:"http://localhost:8080/AccountingERPSystem/rest/AccountsReceivable/Update",
			data: ko.toJSON(userObject),
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
    
};
    
    $(document).ready(function()
      {
          var model = new accountsPayableModel();
          ko.applyBindings(model);
      });