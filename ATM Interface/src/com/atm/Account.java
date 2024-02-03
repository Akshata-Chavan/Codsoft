package com.atm;
public class Account {
    private double balance=10000;
    private double withdraw;
    private double deposit;

    public Account(){}
    
    
    public double getBalance(){
        return balance;
    }

    public void updateBalance(double balance){
        this.balance= balance;
    }

    public double getWithdraw() {
    	return withdraw;
    }
    
    public void updateWithdraw(double withdraw) {
    	this.withdraw=withdraw;
    }
    
    public double getDeposit() {
    	return deposit;
    }
    
    public void updateDeposit(double deposit) {
    	this.deposit=deposit;
    }
    
}