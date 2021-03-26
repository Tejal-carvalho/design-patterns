package com.techlab.test;

import com.techlab.model.Account;
import com.techlab.model.DepositCommand;
import com.techlab.model.Schedular;
import com.techlab.model.WithdrawCommand;

public class Test {

	public static void main(String[] args) {
		Account acc1 = new Account(101, "abc", 1000);
		printInfo(acc1);
		Schedular s1 = new Schedular();
		s1.addCommand(new DepositCommand(acc1,5000));
		s1.addCommand(new WithdrawCommand(acc1, 2000));
		s1.executeAll();
		printInfo(acc1);
		s1.undoAll();
		printInfo(acc1);
		

	}

	private static void printInfo(Account acc) {
		System.out.println(acc.getBalance());
		
	}

}
