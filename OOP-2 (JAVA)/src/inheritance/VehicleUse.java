package inheritance;

public class VehicleUse {

	public static void main(String[] args) {
	
		Vehicle v = new Vehicle();
			
		v.color = "Blue";
		v.print();
		
		Car c = new Car(13);
	// "." gives you all the properties of the parent class and also its own properties 
		c.Car();
	}

}
