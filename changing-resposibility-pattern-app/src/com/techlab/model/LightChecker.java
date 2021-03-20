package com.techlab.model;

public class LightChecker extends HomeSecurityChecker{

	@Override
	public void check(HomeStatusDto dto) throws Exception {
		System.out.println("checking lights");
		if(!dto.lightOff) {
			throw new Exception("lights are on");
		}
		this.callNext(dto);
	}

}
