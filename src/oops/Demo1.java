package oops;
 class Person{
	 
	 String name ;
	 String email ;
	 String phone ;
	 
	 void walk() {
		 System.out.println(name + " is walking");
	 }
		 
	void eat() {
			 System.out.println(name + " is walking");
	}		 
			 
	 void sleep() {
				 System.out.println(name + " is walking");
		 
	 }
 }

public class Demo1 {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.eat();
		
		
		
	}

}
