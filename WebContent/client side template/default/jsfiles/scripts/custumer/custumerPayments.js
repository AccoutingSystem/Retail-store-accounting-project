var custumerPayments = function()
{
    var self = this;
    self.amount = ko.observable(0.0);
    //self.custSurname = ko.observable("");  
};

$(document).ready(function()
{
    ko.applyBindings(new custumerPayments());
});

