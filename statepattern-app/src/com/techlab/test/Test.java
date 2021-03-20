package com.techlab.test;

import com.techlab.model.TranstileMachine;

public class Test {

	public static void main(String[] args) {
		TranstileMachine fsm=new TranstileMachine();
		fsm.insertCoin();
		fsm.insertCoin();
		fsm.passthrough();
		fsm.passthrough();
		fsm.passthrough();
		fsm.insertCoin();

	}

}
