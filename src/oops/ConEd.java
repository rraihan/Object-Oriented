package oops;

public class ConEd {
	//variable
	
	String accoutnumber;
	String accountholder;
	String ssn;
	String accounttype;
	String Dollar;
	//Constructor 
	
	/*
	
	ConEd (String accountnumber) {
		
	}
	*/
	
	void deposit () {
		System.out.println();
	}
	void createaccount() {
		System.out.println("The new account holder name is " + accountholder);
		
	}
	
	void createbill() {
		System.out.println("The current bill for " + accountholder + " is " + Dollar );
		System.out.println(accountholder +"'s" + " social security number is  " + ssn);
		
		
	}
}
