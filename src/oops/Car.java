package oops;
  
class build {
	
	String model ;
	String light ;
	int    door  ;
	int    wheels;
	String colour;
	
	
		
	void speed() {
		System.out.println(model +"'s" + "  top speed is 170 miles per hour");
		}
	
	void colour() {
		System.out.println(model +"'s" + "  top selling car is " + colour);
		}
	
	
}



public class Car {

	public static void main(String[] args) {
		
	build build1 =new build();
	build1.model = "Toyota";
	build1.speed();
		
	build build2 =new build();
	build2.colour = "Red";
	build2.model = "Toyota";
	build2.colour();
	
		
	}

}
