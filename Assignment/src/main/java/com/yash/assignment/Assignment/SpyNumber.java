package com.yash.assignment.Assignment;



public class SpyNumber {

	public static boolean checkSpyNumber( int digit) {

		int prod=1,sum=0,rem;

		while(digit!=0) {
			rem = digit % 10;
			prod = prod * rem;
			sum = sum + rem;
			digit = digit / 10;
		}
		if(sum==prod) {
			return true;
		}else {
			return false;
		}
	}
}
