var app=angular.module('mcm', []); //'app-directives'

app.controller("TransactionController", function($log, $http)
{
	this.accountNumber;
	this.allTransactions = [];
	this.toDate = "";
	this.fromDate = "";
	
	this.getTransactionsFromServer = function()
	{  
	    var _this = this;
		$http.get('/london.api/rest/transaction/All/' + this.accountNumber + '/' + this.fromDate + "/" + this.toDate).then(function(response){
			$log.log(response.data);			
			_this.allTransactions = response.data;	
			
			_this.allTransactions = _this.removeTimeTxt(_this.allTransactions);
			_this.allTransactions =  _this.filterMonths(_this, _this.allTransactions);
		});	
	
	}
	
	
	this.filterMonths = function(_this, transactions)
	{
		var filteredTransactions = [];
		for(var x = 0; x < transactions.length; x++)
		{
			var transactionDate = new Date(transactions[x].dateOfTransaction);
			transactionMonth = transactionDate.getMonth();			
			if(transactionMonth >= this.fromDate &&  transactionMonth <= this.toDate){
				filteredTransactions.push(transactions[x]);
			}
		}		
		return filteredTransactions;
	}
	
	
	this.removeTimeTxt = function(transactions)
	{
		for(var x = 0; x < transactions.length; x++){
			transactions[x].dateOfTransaction = transactions[x].dateOfTransaction.substr(0,12);
		}
		return transactions;
	}
	
});



app.controller("AverageController", function($log, $http)
{
	this.accountNumber;
	this.fromDate;
	this.toDate;
	this.allTransactions = [];
	this.avgSpending;
	this.avgIncome = "";
	
	this.getAverageInfo = function()
	{
		function getAverageSpend(transactions)
		{
			var avg = 0;
			for(var x = 0; x < transactions.length; x++){
				if(transactions[x].deposit_Withdrawal == "Withdrawal"){
					avg += transactions[x].amount;				
				}			
			}
			avg = avg / transactions.length;
			return avg;
		}
		
		
		
		$log.log("acc num" + this.accountNumber);
		$log.log("from: " + this.fromDate);
		$log.log("to: " + this.toDate);
    
	    var _this = this;
	    $http.get('/london.api/rest/transaction/All/' + this.accountNumber + '/' + this.fromDate + "/" + this.toDate).then(function(response){
			//$log.log(response.data);
			_this.allTransactions = response.data;	
			
			_this.allTransactions = _this.removeTimeTxt(_this.allTransactions);
			_this.allTransactions =  _this.filterMonths(_this, _this.allTransactions);
			
			_this.avgSpending = "£" + (getAverageSpend(_this.allTransactions).toFixed(2));			
		});	
	}
	
	
	this.filterMonths = function(_this, transactions)
	{
		var filteredTransactions = [];
		for(var x = 0; x < transactions.length; x++)
		{
			var transactionDate = new Date(transactions[x].dateOfTransaction);
			transactionMonth = transactionDate.getMonth();			
			if(transactionMonth >= this.fromDate &&  transactionMonth <= this.toDate){
				filteredTransactions.push(transactions[x]);
			}
		}		
		return filteredTransactions;
	}
	
	
	this.removeTimeTxt = function(transactions)
	{
		for(var x = 0; x < transactions.length; x++){
			transactions[x].dateOfTransaction = transactions[x].dateOfTransaction.substr(0,12);
		}
		return transactions;
	}
	
	
});











