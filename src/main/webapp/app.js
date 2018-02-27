var app=angular.module('mcm', []); //'app-directives'

app.controller("TransactionController", function($log, $http)
{
	this.allTransactions = [];
	this.toDate = "jan";
	this.fromDate = "march";
	
	this.getTransactionsFromServer = function()
	{
		$log.log("from: " + this.fromDate);
		$log.log("to: " + this.toDate);
		$log.log("getTransactionsFromServer method");	    
	    var _this = this;
		$http.get('/london.api/rest/transaction/transactions/' + this.fromDate + "/" + this.toDate).then(function(response){
			$log.log(response.data);
			_this.allTransactions = response.data;
		});	
	
	}
	
	this.storeTransactions = function()
	{
		$log.log("storeTransactions method");
		 
		var transaction = {
			date: "test",
			reference: "test",
			_in: "test",
			out: "test",
			balance: "test",
			type: "test"
		}
		
		
		
		this.allTransactions.push(transaction);		
		$log.log(this.allTransactions);
	}
	
});



app.controller("AverageController", function($log, $http)
{
	this.fromDate;
	this.toDate;
	this.avgSpending;
	this.avgIncome;
	
	this.getAverageInfo = function()
	{
		$log.log("from: " + this.fromDate);
		$log.log("to: " + this.toDate);
		$log.log("getAverageInfo method");	    
	    var _this = this;
		$http.get('/london.api/rest/class/method/' + this.fromDate + "/" + this.toDate).then(function(response){
			$log.log(response.data);
			_this.fromDate = response.data.fromDate;
			_this.toDate = response.data.toDate;
		});	
	}
	
	
});











