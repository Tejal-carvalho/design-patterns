package com.techlab.test;

import com.techlab.model.AlarmChecker;
import com.techlab.model.HomeStatusDto;
import com.techlab.model.LightChecker;
import com.techlab.model.LockChecker;

public class HomeSecurityTest {

	public static void main(String[] args)  {
		LightChecker light=new LightChecker();
		AlarmChecker alarm=new AlarmChecker();
		LockChecker lock=new LockChecker();
		light.succeedWith(alarm);
		alarm.succeedWith(lock);
		HomeStatusDto dto=new HomeStatusDto();
		dto.lightOff=true;
		dto.alarmOn=true;
		dto.lockOn=false;
	    try {
			light.check(dto);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
