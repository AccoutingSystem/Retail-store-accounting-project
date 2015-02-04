var custumerModel = function()
{
    var self = this;
    self.listOfCustumers = ko.observableArray([]);
    self.custName = ko.observable("");
    self.custSurname = ko.observable("");
    self.custAddress = ko.observable("");
    self.contactNr = ko.observable("");
    self.occupation = ko.observable("");
    self.gender = ko.observable("");
    self.idNr = ko.observable("");
    self.income = ko.observable(0.0);
    self.monthlyExpenses = ko.observable(0.0);
    self.branchCode = ko.observable(0);
    self.bankName = ko.observable("");
    self.email = ko.observable("");
     
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
            url: 'http://localhost:8080/AccountingERPSystem/rest/Customer/Save',
            data: ko.toJSON(custumer),
            contentType: 'application/json',
            dataType: "json",
            success: function(status,http)
            {
            	 alert(" :bingo.. ");
            	 // empty the properties
            	 	self.custName("");
            	    self.custSurname("");
            	    self.custAddres("");
            	    self.contactNr("");
            	    self.occupation("");
            	    self.gender("");
            	    self.idNr("");
            	    self.income(0.0);
            	    self.monthlyExpenses(0.0);
            	    self.branchCode;
            	    self.bankName("");
            	    self.email("");

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
            url: "http://localhost:8080/AccountingERPSystem/rest/Customer/CustomerID?custId="+self.custId()+"&custName="+self.custName()+"&custSurname="+self.custSurname()+"&custAddress="+self.custAddress()+"&contactNr="+self.contactNr()+"&occupation="+self.occupation()+"&gender="+self.gender()+"&idNr="+self.idNr()+"&income="+self.income()+"&monthlyExpenses="+self.monthlyExpenses()+"&branchCode="+self.branchCode()+"&bankName="+self.bankName()+"&email="+self.email(),
            contentType: 'application/json',
            dataType: "json",
            success: function()
            {
               alert("update successful");
            // empty the properties
       	 	self.custName("");
       	    self.custSurname("");
       	    self.custAddres("");
       	    self.contactNr("");
       	    self.occupation("");
       	    self.gender("");
       	    self.idNr("");
       	    self.income(0.0);
       	    self.monthlyExpenses(0.0);
       	    self.branchCode;
       	    self.bankName("");
       	    self.email("");

            },
            error: function()
            {
                alert("error has occured");
            }
        });
    };
    
    // delete custumer
    self.deleteCustumer = function() {

        $.ajax({
            url: "http://localhost:8080/AccountingERPSystem/rest/Customer/CustomerID?idNr="+self.idNr(),
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
    // retrive  custumer list
    self.custumerList = function()
    {
        $.ajax({
            type: 'GET',
            url: 'http://localhost:8080/AccountingERPSystem/rest/Customer/Retrieve',
            contentType: 'application/json',
            dataType: "json",
            success: function(data)
            {
               self.listOfCustumers(data);

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
    ko.applyBindings(new custumerModel());
});

