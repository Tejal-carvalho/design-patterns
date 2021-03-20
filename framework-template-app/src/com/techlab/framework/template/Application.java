package com.techlab.framework.template;

public abstract class Application {
	protected boolean isComplete = false;
	public void run() {
		initialize();
		while(!isComplete) {
			doWork();
		}
		clean();
	}
	abstract protected void initialize();
	abstract protected void doWork();
	abstract protected void clean();
	

}
