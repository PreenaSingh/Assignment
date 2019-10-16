package com.yash.assignment.factorydesignpattern;

class LoanFactory extends AbstractFactory{  
	public Bank getBank(String bank){  
		return null;  
	}  

	public Loan getLoan(String loan){  
		if(loan == null){  
			return null;  
		}  
		if(loan.equalsIgnoreCase("Home")){  
			return new HomeLoan();  
		} else if(loan.equalsIgnoreCase("Car")){  
			return new CarLoan();  
		} else if(loan.equalsIgnoreCase("Education")){  
			return new EducationLoan();  
		}  
		return null;  
	}  

}  
