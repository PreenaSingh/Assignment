package com.yash.assignment.factorydesignpattern;

public class BankFactory extends AbstractFactory{
	
		   public Bank getBank(String bank){  
		      if(bank == null){  
		         return null;  
		      }  
		      if(bank.equalsIgnoreCase("UNION")){  
		         return new UNION();  
		      } else if(bank.equalsIgnoreCase("CITY")){  
		         return new CITY();  
		      } else if(bank.equalsIgnoreCase("AXIS")){  
		         return new AXIS();  
		      }  
		      return null;  
		   }  
		  public Loan getLoan(String loan) {  
		      return null;  
		   }  
		}

