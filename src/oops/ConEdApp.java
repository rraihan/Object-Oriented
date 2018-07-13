package oops;

public class ConEdApp {

	public static void main(String[] args) {

		//we instantiate  our our objects 
		ConEd coned1 = new ConEd(); 
		
		//we fine our properties 
		
		coned1.accoutnumber="5656565455";
		coned1.accountholder ="joe";
		coned1.ssn ="205-48-7812";
		coned1.accounttype = "business";
		coned1.Dollar= "$500.00";
		
		
		
		// create contractor 
		coned1.deposit();
		coned1.createaccount();
		coned1.createbill();
			
		
	}

}
