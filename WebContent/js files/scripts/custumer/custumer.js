var custumerModel = function()
{
    var self = this;
    this.custName = ko.observable("");
    this.custSurname = ko.observable("");
    this.custAddress = ko.observable("");
    this.contactNr = ko.observable("");
    this.occupation = ko.observable("");
    this.gender = ko.observable("");
    this.idNr = ko.observable("");
    this.income = ko.observable(0.0);
    this.monthlyExpenses = ko.observable(0.0);
    this.branchCode = ko.observable(0);
    this.bankName = ko.observable("");
    this.email = ko.observable("");
   
    
    
    var custumer = {
        //email: self.email,
    		custName: self.custName,
    	    custSurname: self.custSurname,
    	    custAddress: self.custAddress,
    	    contactNr: self.contactNr,
    	    occupation: self.occupation,
    	    gender: self.gender,
    	    idNr: self.idNr,
    	    income: self.income,
    	    monthlyExpenses: self.monthlyExpenses,
    	    branchCode: self.branchCode,
    	    bankName: self.bankName,
    	    email: self.email  
    };

    
    self.save = function()
    {
        $.ajax({
            type: 'POST',
            url: '',
            data: ko.toJSON(custumer),
            contentType: 'application/json',
            dataType: "json",
            success: function(status,http)
            {
            	 alert(" :bingo.. ");

            },
            error: function(status,XHR)
            {
                //alert(" :not " + status);
                alert(XHR.status + " : "+ " status" + status);
            }
        });
    };
   
};

$(document).ready(function()
{
    ko.applyBindings(new custumerModel());
});

