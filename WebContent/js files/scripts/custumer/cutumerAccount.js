var custumerAccount = function(){
	
	var self = this;
	self.accID = ko.observable();
	self.accountList = ko.observableArray([]);
	
	self.custbalance = ko.observable(0.0);
	self.installment = ko.observable(0.0);
	self.custCredit = ko.observable(0.0);
	self.date = ko.observable("");
	self.interestRate = ko.observable(0.0);
	
	var custumerAcc={
			custbalance: self.custbalance,
			installment: self.installment,
			custCredit: self.custCredit,
			date: self.date,
			interestRate: self.interestRate		
	};
	
	// save account for a custumer
    self.saveAcc = function()
    {
        $.ajax({
            type: 'POST',
            url: '',
            data: ko.toJSON(custumerAcc),
            contentType: 'application/json',
            dataType: "json",
            success: function(status,http)
            {
            	 alert(" :bingo.. ");
            	 // empty the properties
            	 	self.custbalance(0.0);
            		self.installment(0.0);
            		self.custCredit(0.0);
            		self.date("");
            		self.interestRate(0.0);	 
            },
            error: function(status,XHR)
            {
                //alert(" :not " + status);
                alert(XHR.status + " : "+ " status" + status);
            }
        });
    };
	
    // delete account
    self.deleteAccount = function() {

        $.ajax({
            url: "http://localhost:8080/AccountingERPSystem/rest?idNr="+self.accID(),
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
     
    // update custumer account info/details
    self.updateCustumerAccount = function()
    {
        $.ajax({
            type: 'POST',
            url: "http://localhost:8080/AccountingERPSystem/rest?custbalance="+self.custbalance()+"&installment="+self.installment()+"&custCredit="+self.custCredit()+"&date="+self.date()+"&interestRate="+self.interestRate(),
            contentType: 'application/json',
            dataType: "json",
            success: function()
            {
               alert("update successful");

            },
            error: function()
            {
                alert("error has occured");
            }
        });
    };
    
    // retrive the accounts
    self.accountsList = function()
    {
        $.ajax({
            type: 'GET',
            url: "http://localhost:8080/AccountingERPSystem/rest/",
            contentType: 'application/json',
            dataType: "json",
            success: function(data)
            {
               self.accountList(data);

            },
            error: function()
            {
                alert("error has occured");
            }
        });
    };
};

$(document).ready(function(){
	ko.applyBinding(new custumerAccount());
});