package com.techlab.model;

public class Account {

	private int accno;
	private String accname;
	private double balance;
	private boolean transactionflag = true;
	private static int count;
	static {
		count = 0;
	}

	public Account(int accno, String accname, double balance) {
		this.accno = accno;
		this.accname = accname;
		this.balance = balance;
		count += 1;
	}

	public int getCount() {
		return count;
	}

	public static int getHeadCount() {
		return count;
	}

	public int getAccNo() {
		return accno;
	}

	public String getAccName() {
		return accname;
	}

	public double getBalance() {
		return balance;
	}

	public boolean getTransactionFlag() {
		return transactionflag;
	}

	void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	boolean withdraw(double amount) {
		if (this.balance - amount < 1000) {
			transactionflag = false;
		} else
			this.balance = this.balance - amount;
		return transactionflag;
	}

}
