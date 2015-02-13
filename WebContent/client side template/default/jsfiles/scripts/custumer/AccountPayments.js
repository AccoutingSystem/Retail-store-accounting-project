var accountPayments = function()
{
    var self = this;
    
    self.paymentHistory = ko.observable([]);
    
    self.accPaymentId = ko.observable();
    self.amount = ko.observable(0.0);
    //self.custSurname = ko.observable(""); 
    
    var accPayments={
    		amount: self.amount,
    		// date here  		
    };
    
    // save payments
    self.savePayment = function()
    {
        $.ajax({
            type: 'POST',
            url: 'http://localhost:8080/AccountingERPSystem/rest/AccountPayments/Save',
            data: ko.toJSON(accPayments),
            contentType: 'application/json',
            dataType: "json",
            success: function(status,http)
            {
            	 alert(" :bingo.. ");
            	 // empty the properties
            	 	self.amount("");
            },
            error: function(status,XHR)
            {
                //alert(" :not " + status);
                alert(XHR.status + " : "+ " status" + status);
            }
        });
        
        // Insert Search code here
    };
    
 // update custumer infor
    self.updateCustumerInfor = function()
    {
        $.ajax({
            type: 'POST',
            url: "http://localhost:8080/AccountingERPSystem/rest/AccountPayments/AccountPaymentID?amount="+self.amount()+"&accPaymentId="+accPaymentId,
            contentType: 'application/json',
            dataType: "json",
            success: function()
            {
               alert("update successful");
            // empty the properties
               self.amount();
            },
            error: function()
            {
                alert("error has occured");
            }
        });
    };
    
    // delete payment
    self.deletePayment = function() {

        $.ajax({
            url: "http://localhost:8080/AccountingERPSystem/rest/AccountPayments/AccountPaymentID?accPaymentId="+self.accPaymentId(),
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
    
    self.paymentRecord = function()
    {
        $.ajax({
            type: 'GET',
            url: 'http://localhost:8080/AccountingERPSystem/rest/AccountPayments/Retrieve',
            contentType: 'application/json',
            dataType: "json",
            success: function(data)
            {
               self.paymentHistory(data);
            },
            error: function()
            {
                alert("error has occured");
            }
        });
    };
};

$(document).ready(function()
{
    ko.applyBindings(new accountPayments());
});
