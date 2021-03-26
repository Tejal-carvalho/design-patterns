package com.techlab.model;

public class WithdrawCommand implements ICommand {
	private Account acc;
	private int amount;
	
	public WithdrawCommand(Account acc,int amount) {
		this.acc=acc;
		this.amount=amount;
	}

	@Override
	public void execute() {
		acc.withdraw(amount);
		
	}

	@Override
	public void undo() {
		acc.deposit(amount);
		
	}

}
