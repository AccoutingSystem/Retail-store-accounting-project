
var accountsReceivableModel = function()
{
    var self = this;
    
    self.receivablefolioNr = ko.observable();
    self.receivableAmount = ko.observable();
    self.receivingDate = ko.observable();
    self.receivingType = ko.observable();
    self.receivableCharts = ko.observable();
    
    
    var userObject = {
      
      folioNr: self.receivablefolioNr,
      amount: self.payableAmount,
      receivablesDate: self.receivingDate,
      receivableType: self.receivingType,
      charts:self.receivableCharts      
    }
    

    self.submit = function()
    {
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/AccountingERPSystem/rest/AccountsReceivable/Save",
            data: ko.toJSON(userObject),
            contentType: 'application/json',
            dataType: 'json',
            success: function()
            {
                alert("Received account successfully added!!!");
            
            },
            error: function()
            {
                alert("Error!!Could not add");
                
            }
        });
    };
    
};
    
    $(document).ready(function()
      {
          var model = new accountsReceivableModel();
          ko.applyBindings(model);
      });