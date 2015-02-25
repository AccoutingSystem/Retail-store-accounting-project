var chartsOfAccountsModel = function()
{
    var self = this;
    
    self.race = ['Black','White','Indian','Colored','Other'];
    self.gender = ['Male','Female'];
  
    self.empName = ko.observable();
    self.empSurname=ko.observable();
	self.empAddress=ko.observable();
	self.empContactNr=ko.observable();
	self.idNumber = ko.observable();
	self.chosengender = ko.observable();
	self.chosenRace = ko.observable();
	self.email = ko.observable();
	self.password =ko.observable();
	
	

    var employeeObject = {
	    empName: self.empName,
	    empSurname:self.empSurname,
	    empAddress: self.empAddress,
	    empContactNr: self.empContactNr,
	    idNumber: self.idNumber,
	    gender:   self.chosengender,
	    race:   self.chosenRace,
	    email: self.email,
	    password: self.password
		
    }
    
  //saving the account chart nn
    self.submit = function()
    {
        $.ajax({
            type: "POST",
            url: 'http://localhost:8080/AccountingERPSystem/rest/Employee/Save',
            data: ko.toJSON(employeeObject),
            contentType: 'application/json',
            dataType: 'json',
            success: function()
            {
                alert("Employee added successfully!!!");
                //console.log(ko.toJSON(employeeObject));
                //empty properties
            },
            error: function()
            {
                alert("Error!!!Could not add");
                console.log(ko.toJSON(employeeObject));
              //empty properties here   
            }
        });
    };
   
};

$(document).ready(function()
  {
      var model = new chartsOfAccountsModel();
      ko.applyBindings(model);
  });
