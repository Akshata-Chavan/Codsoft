package com.atm;

import java.util.Scanner;

public class Atm {

	public static void main(String args[]) {
		OperationInterface op= new Operations();
		int atmpin=654;
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Your Account!!");
		while(true) {
			System.out.println("\n1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Statement\n5.Exit\n");
			System.out.print("Enter Choice : ");
			int ch=sc.nextInt();
			if (ch==1) {
				System.out.print("Enter ATM Pin: ");
				int pin=sc.nextInt();
				if(atmpin == pin){
					System.out.println("Account Authorized!\n");
					op.viewBalance();
				}
				else {
					System.out.println("Incorrect ATM pin");
					System.exit(0);
				}}

			else if(ch == 2){
				System.out.print("Enter ATM Pin: ");
				int pin=sc.nextInt();
				if(atmpin == pin){
					System.out.println("Account Authorized!\n");
					System.out.println("Enter amount to withdraw ");
					double withdrawAmount=sc.nextDouble();
					op.withdraw(withdrawAmount);
				}
				else{
					System.out.println("Incorrect Atm Number or pin");
					System.exit(0);
				}
			}

			else if(ch == 3){
				System.out.print("Enter ATM Pin: ");
				int pin=sc.nextInt();
				if(atmpin==pin){
					System.out.println("Account Authorized! \n");
					System.out.println("Enter Amount to Deposit :");
					double depositAmount=sc.nextDouble();
					op.deposit(depositAmount);
				}
				else{
					System.out.println("Incorrect Atm Number or pin");
					System.exit(0);
				}
			}

			else if(ch == 4){
				System.out.print("Enter ATM Pin: ");
				int pin=sc.nextInt();
				if(atmpin==pin){
					System.out.println("Account Authorized! \n");
					System .out.println("Statement");
					System.out.println("************************");
					op.viewStatement();
				}
			}

			else if(ch == 5){
				System.out.println("Collect your ATM Card \nThank you for using ATM Machine!!");
				System.exit(0);
			}

			else
			{
				System.out.println("Please enter valid choice");
			}

		}
	}
}

