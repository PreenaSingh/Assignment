package com.yash.assignment.factorydesignpattern;

public class CITY   implements Bank{

	private final String BNAME;  
	public CITY(){  
		BNAME="CITY BANK";  
	}  
	public String getBankName() {  
		return BNAME;  
	}  
}  


