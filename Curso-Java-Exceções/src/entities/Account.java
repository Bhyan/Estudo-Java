package entities;

import entities.exception.AmountInvalid;
import entities.exception.WithdrawLimit;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account() {}
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) throws AmountInvalid {
		if(amount <= 0.0) {
			throw new AmountInvalid("Value can not be deposited");
		}
		else {
			balance += amount;
		}
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdraw(double amount) throws WithdrawLimit {
		if(amount > withdrawLimit) {
			throw new WithdrawLimit("The amount exceeds withdraw limit.");
		}
		
		if(amount > balance) {
			throw new WithdrawLimit("Not enough balance.");
		}
		
		balance -= amount;
	}
}
