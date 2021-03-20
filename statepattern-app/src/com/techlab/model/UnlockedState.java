package com.techlab.model;

public class UnlockedState implements State {
	private TranstileMachine fsm;

	public UnlockedState(TranstileMachine fsm) {
		this.fsm = fsm;
	}

	@Override
	public void coin() {
		fsm.thankyouAction();

	}

	@Override
	public void pass() {
		fsm.setState(fsm.getLockedState());
		fsm.lockAction();

	}

}
