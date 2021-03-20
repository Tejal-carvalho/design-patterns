package com.techlab.model;

public class TranstileMachine {
	private State lockstate;
	private State unlockstate;
	private State currentstate;

	public TranstileMachine() {
		this.lockstate = new LockedState(this);
		this.unlockstate = new UnlockedState(this);
		this.currentstate = this.lockstate;
	}

	public void setState(State newstate) {
		this.currentstate = newstate;

	}

	public State getLockedState() {
		return lockstate;
	}

	public State getUnlockedState() {
		return unlockstate;
	}

	public void unlockAction() {
		System.out.println("unlocking the door");
	}

	public void alarmAction() {
		System.out.println("alarm....");
	}

	public void thankyouAction() {
		System.out.println("Thank you...Door is already unlocked");
	}

	public void lockAction() {
		System.out.println("locking the door");

	}

	public void insertCoin() {
		currentstate.coin();
	}

	public void passthrough() {
		currentstate.pass();
	}

}
