var app=angular.module('mcm', []); //'app-directives'

app.controller("TransactionController", function($log)
{
	var allTransactions = [];
	
	this.storeTransactions = function()
	{
		$log.log("here");
		 
		var transaction = {
			date: "test",
			reference: "test",
			_in: "test",
			out: "test",
			balance: "test",
			type: "test"
		}		
		allTransactions.push(transaction);		
		$log.log(this.allTransactions);
	}
	
});