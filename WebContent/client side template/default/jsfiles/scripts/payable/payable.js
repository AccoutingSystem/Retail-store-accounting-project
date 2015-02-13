var accountsPayableModel = function()
{
    var self = this;
    
    self.payablefolioNr = ko.observable();
    self.payableAmount = ko.observable();
    self.paymentDate = ko.observable();
    self.paymentType = ko.observable();
    self.payableCharts = ko.observable();
    
    
    var userObject = {
      
      folioNr: self.payablefolioNr,
      amount: self.payableAmount,
      paymentDate: self.paymentDate,
      paymentType: self.paymentType,
      charts:self.payableCharts      
    }
    

    self.submit = function()
    {
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/AccountingERPSystem/rest/AccountsPayable/Save",
            data: ko.toJSON(userObject),
            contentType: 'application/json',
            dataType: 'json',
            success: function()
            {
                alert("Payable account successfully added!!!");
            
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
          var model = new accountsPayableModel();
          ko.applyBindings(model);
      });