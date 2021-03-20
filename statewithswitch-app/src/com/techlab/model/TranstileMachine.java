package com.techlab.model;

public class TranstileMachine {
	private State currentState = State.LOCK;

	private void unlockAction() {
		System.out.println("unlocking the door");
	}

	private void alarmAction() {
		System.out.println("alarm....");
	}

	private void thankyouAction() {
		System.out.println("Thank you...Door is already unlocked");
	}

	private void lockAction() {
		System.out.println("locking the door");

	}

	public void handle(Event e) {
		switch (currentState) {
		case LOCK:
			switch (e) {
			case COIN:
				unlockAction();
				currentState=State.UNLOCK;
				break;
			case PASS:
				alarmAction();
				break;
			}
			break;
		case UNLOCK:
			switch (e) {
			case COIN:
				thankyouAction();
				break;
			case PASS:
				lockAction();
				currentState=State.LOCK;
				break;
			}
			break;

		}
	}

}
