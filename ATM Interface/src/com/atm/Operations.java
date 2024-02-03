package com.atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Operations implements OperationInterface {

	Account acc = new Account();
	Map<Double, String> st = new HashMap<Double, String>();

	@Override
	public void viewBalance() {
		System.out.println("\nLoading Accout Balance.......");
		System.out.println("Your Current Balance is : " + acc.getBalance());
		System.out.println();
	}

	@Override
	public void withdraw(double withdraw) {
		Scanner sc = new Scanner(System.in);
		if (withdraw <= acc.getBalance()) {
			System.out.println("Confirm? Y/N");
			String confirm = sc.next();
			if (confirm.equals("Y") || confirm.equals("y")) {
				st.put(withdraw, " Amount Withdrawn");
				System.out.println("Collect the Cash " + withdraw);
				acc.updateBalance(acc.getBalance() - withdraw);
				viewBalance();
			}
		} else {
			System.out.println("Insufficient Balance !!");
		}

	}

	@Override
	 public void deposit(double deposit ) {
	 	System.out.println("Confirm? Y/N");
    	Scanner sc=new Scanner(System.in);
    	String confirm=sc.next();
	    if(confirm.equals("Y") || confirm.equals("y")) {
        st.put(deposit," Amount Deposited");
        System.out.println(deposit+" Deposited Successfully !!");
        acc.updateBalance(acc.getBalance()+deposit);
        viewBalance();
	    }
  
	}

	@Override
	public void viewStatement() {
		for (Map.Entry<Double, String> m : st.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());

		}
	}
}