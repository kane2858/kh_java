package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
//		2019년은 평년입니다.
//		총 날짜 수 : 737164
		int year = 2019;
		String str = "평년";
		LeapController lc = new LeapController();
		if(lc.isLeapYear(year)) {
			str = "윤년";
		}
		System.out.println(year+"년은 "+str+"입니다.");

		// 현재 날짜
		Calendar today = Calendar.getInstance();
		
		lc.leapDate(today);
		
		
		
	
	}


}
