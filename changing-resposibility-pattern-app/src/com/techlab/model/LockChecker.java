package com.techlab.model;

public class LockChecker extends HomeSecurityChecker{

	@Override
	public void check(HomeStatusDto dto) throws Exception {
		System.out.println("Checking locks");
		if(!dto.lockOn) {
			throw new Exception("doors are open.");
		}
		this.callNext(dto);
		
	}

	
}
