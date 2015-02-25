function createPayableList(payable) {
    var self = this;
    self.List=ko.observable(payable);    
}
var accountsPayableModel = function()
{
    var self = this;
    
    self.payableList = ko.observableArray([]);
    
    self.payablefolioNr = ko.observable();
    self.payableAmount = ko.observable();
    self.paymentDate = ko.observable();
    self.paymentType = ko.observable();
    self.chartcode = ko.observable(0);
    
    
    self.totalSurcharge = ko.computed(function() {
        var total = 0;
        for (var i = 0; i < self.payableList().length; i++)
            total += self.payableList()[i].List().amount;
        return total;
     });    

    var userObject = {
      folioNr: self.payablefolioNr,
      amount: self.payableAmount,
      paymentDate: self.paymentDate,
      paymentType: self.paymentType,
      c: self.chartcode
    }
    
	/*AccountsPayableDao ds=new AccountsPayableDao();
	ds.saveAccountsPayables(accPay, charts2.getChartCode());
*/
    self.submit = function()
    {
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/AccountingERPSystem/rest/AccountsPayable/Save",//?payable="+userObject+"&chartId="+self.chartcode(),
            data: ko.toJSON(userObject),
            contentType: 'application/json',
            dataType: 'json',
            success: function()
            {
                alert("Payable account successfully added!!!");
            
            },
            error: function(data)
            {
            	debugger;
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
            url: 'http://localhost:8080/AccountingERPSystem/rest/AccountsPayable/Retrieve',
            contentType: 'application/json',
            dataType: "json",
            success: function(data)
            {
            	 debugger;
            	console.log(data);
            	console.log(ko.toJSON(data));
              for (i = 0; i < data.length; i++)
               {
            	  self.payableList.push(new createPayableList(data[i]));
               }   
            },
            error: function()
            {
                alert("Error has occured!!!");
            }
        });
    };
    
 // update payable   
    self.updatePayableInfor = function()
    {
        $.ajax({
            type: 'PUT',
            url:"http://localhost:8080/AccountingERPSystem/rest/AccountsPayable/Update",
            data: ko.toJSON(userObject ),
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