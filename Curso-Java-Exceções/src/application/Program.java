package application;

import java.util.Scanner;

import entities.Account;
import entities.exception.WithdrawLimit;

public class Program {

	public static void main(String[] args) throws WithdrawLimit {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance  = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		
		try {
			account.withdraw(sc.nextDouble());
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		}
		catch(WithdrawLimit erro) {
			System.out.println("Withdraw error: " + erro.getMessage());
		}
		
		sc.close();
	}

}
