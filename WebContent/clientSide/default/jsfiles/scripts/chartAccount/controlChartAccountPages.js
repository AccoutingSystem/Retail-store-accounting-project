(function($){
	
	var app=$.sammy('#main',function(){
		// Routes defination for chart of account
		this.get('#/addChartAccount',function(context){
			this.partial('AddChartAccount.html')
		});
		this.get('#/searchChartOfAccount',function(context){
			this.partial('SearchChartOfAccount.html')
		});
		this.get('#/viewChartOfAccount',function(context){
			this.partial('ViewChartOfAccount.html')
		});
		this.get('#/updateChartOfAccount',function(context){
			this.partial('UpdateChartOfAccount.html')
		});
		
		// Routes defination for payable account
		this.get('#/searchPayable',function(context){
			this.partial('SearchPayable.html')
		});
		this.get('#/createPayable',function(context){
			this.partial('CreatePayablel.html')
		});
		this.get('#/viewPayable',function(context){
			this.partial('ViewPayable.html')
		});
		this.get('#/updatePayable',function(context){
			this.partial('UpdatePayable.html')
		});
		
		// Routes defination for receivable account 
		this.get('#/searchReceivable',function(context){
			this.partial('SearchReceivable.html')
		});
		this.get('#/createReceivable',function(context){
			this.partial('CreateReceivable.html')
		});
		this.get('#/viewReceivable',function(context){
			this.partial('ViewPayable.html')
		});
		this.get('#/updateReceivable',function(context){
			this.partial('UpdateReceivable.html')
		});
		
	});
	
	
	$(function(){
		app.run('#/')
	})
	
})(jQuery);