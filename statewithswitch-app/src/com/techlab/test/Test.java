package com.techlab.test;

import com.techlab.model.Event;
import com.techlab.model.TranstileMachine;

public class Test {

	public static void main(String[] args) {
		TranstileMachine fsm=new TranstileMachine();
		fsm.handle(Event.COIN);
		fsm.handle(Event.COIN);
		fsm.handle(Event.PASS);
		fsm.handle(Event.PASS);
		fsm.handle(Event.PASS);
	

	}

}
