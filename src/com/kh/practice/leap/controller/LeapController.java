package com.kh.practice.leap.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {

		return new GregorianCalendar().isLeapYear(year);
	}

	public long leapDate(Calendar today) {

		Calendar num = Calendar.getInstance();

		
		return 0l;
	}

}
