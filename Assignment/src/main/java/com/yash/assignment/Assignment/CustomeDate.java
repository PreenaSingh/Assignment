package com.yash.assignment.Assignment;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomeDate {
	
	
	public LocalDate tofindDateafterAddigNumberToCurrentDate(long days) {
		LocalDate currentDate=LocalDate.now();
		return currentDate.plusDays(days);
	}
	

}
