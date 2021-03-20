package com.techlab.model;

public class AlarmChecker extends HomeSecurityChecker{

	@Override
	public void check(HomeStatusDto dto) throws Exception {
		System.out.println("checking alarm");
		if(!dto.alarmOn) {
			throw new Exception("alarms are off");
		}
		this.callNext(dto);
		
	}

}
