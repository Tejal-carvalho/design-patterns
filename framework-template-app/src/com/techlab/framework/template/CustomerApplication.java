package com.techlab.framework.template;

public class CustomerApplication extends Application {
    private int count=0;
	@Override
	protected void initialize() {
		count=1001;
		System.out.println("initialize app for customer");
		
	}

	@Override
	protected void doWork() {
		System.out.println("display customer with id:" +count);
		if(count>=1020) {
			isComplete=true;
		}
		count+=1;
		
	}

	@Override
	protected void clean() {
		count=0;
		System.out.println("reset counter");
		
	}

}
