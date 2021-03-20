package com.techlab.model;

public class LockedState implements State {
	private TranstileMachine fsm;

	public LockedState(TranstileMachine fsm) {
		this.fsm = fsm;
	}

	@Override
	public void coin() {
		fsm.setState(fsm.getUnlockedState());
		fsm.unlockAction();

	}

	@Override
	public void pass() {
		fsm.alarmAction();

	}

}
