var app=angular.module('mcm', []); //'app-directives'

app.controller("TransactionController", function($log, $http)
{
	this.accountNumber;
	this.allTransactions = [];
	this.toDate = "march";
	this.fromDate = "jan";
	
	this.getTransactionsFromServer = function()
	{  
	    var _this = this;
		$http.get('/london.api/rest/transaction/All/' + this.accountNumber + '/' + this.fromDate + "/" + this.toDate).then(function(response){
			$log.log(response.data);			
			_this.allTransactions = response.data;
			
			
			for(var x = 0; x < _this.allTransactions.length; x++){
				_this.allTransactions[x].dateOfTransaction = _this.allTransactions[x].dateOfTransaction.substr(0,12);
			}
		});	
	
	}
	

	
});



app.controller("AverageController", function($log, $http)
{
	this.accountNumber;
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
		$http.get('/london.api/rest/transaction/average/' + this.accountNumber + '/' + this.fromDate + "/" + this.toDate).then(function(response){
			$log.log(response.data);
			_this.fromDate = response.data.fromDate;
			_this.toDate = response.data.toDate;
		});	
	}
	
	
});











