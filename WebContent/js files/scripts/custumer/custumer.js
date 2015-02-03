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

    // save cusstumer
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
            	 // code to empty to properties here

            },
            error: function(status,XHR)
            {
                //alert(" :not " + status);
                alert(XHR.status + " : "+ " status" + status);
            }
        });
    };
    
    /*public void update( 
		
		  
			 String email)*/
   
    // update custumer infor
    self.update = function()
    {
        $.ajax({
            type: 'POST',
            url: "http://localhost:8080/AccountingERPSystem/rest?custId="+self.custId()+"&custName="+self.custName()+"&custSurname="+self.custSurname()+"&custAddress="+self.custAddress()+"&contactNr="+self.contactNr()+"&occupation="+self.occupation()+"&gender="+self.gender()+"&idNr="+self.idNr()+"&income="+self.income()+"&monthlyExpenses="+self.monthlyExpenses()+"&branchCode="+self.branchCode()+"&bankName="+self.bankName()+"&email="+self.email(),
            data: ko.toJSON(userObject),
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
    
    // delete custumer
    self.delete_ = function() {

        $.ajax({
            url: "http://localhost:8080/AccountingERPSystem/rest?idNr="+self.idNr(),
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
    ko.applyBindings(new custumerModel());
});

