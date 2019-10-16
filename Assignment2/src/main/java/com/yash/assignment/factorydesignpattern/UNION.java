package com.yash.assignment.factorydesignpattern;

public class UNION  implements Bank{
	private final String bName;  
	public UNION(){  
		bName="UNION BANK";  
	}  
	public String getBankName(){  
		return bName;  
	}  

}
