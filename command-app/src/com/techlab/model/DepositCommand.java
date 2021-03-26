package com.techlab.model;

public class DepositCommand implements ICommand{
	private Account acc;
	private int amount;
	
	public DepositCommand(Account acc,int amount) {
		this.acc=acc;
		this.amount=amount;
	}

	@Override
	public void execute() {
		acc.deposit(amount);
		
	}

	@Override
	public void undo() {
		acc.withdraw(amount);
		
	}

}
