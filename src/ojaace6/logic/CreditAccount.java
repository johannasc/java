package ojaace6.logic;

import java.util.ArrayList;

public class CreditAccount extends Account
{
	private String accountType;
	private int creditLimit;
	private double interestRate;
	private double balance = 0;
	private double loanInterest;
	ArrayList<String> accountTransactions = new ArrayList<String>();
	
	public String getAccountType() { return this.accountType; } 
	public double getInterestRate() { return this.interestRate; }   
	public double getLoanInterestRate() { return this.loanInterest; }   
	public double getCurrentInterest() { return balance * interestRate/50; }  
	public void setBalance(double newBalance) { balance += newBalance; }
	public double getBalance() { return balance; } 
	public double getCreditLimit() { return creditLimit; }  
	public ArrayList<String> getTransactions() { return accountTransactions; } 
	public void makeTransaction(String transaction) { accountTransactions.add(transaction); }

	public CreditAccount() 
	{
		this.accountType = "Kreditkonto";
		this.interestRate = 0.5;
		this.creditLimit = -5000;
		this.loanInterest = 7.0;
	}
}
