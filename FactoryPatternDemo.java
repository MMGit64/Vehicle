
public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle vehicle1 = vehicleFactory.getVehicle("Car");
		vehicle1.drive();
		
		
		Vehicle vehicle2 = vehicleFactory.getVehicle("motorbike");
		vehicle2.drive();
		
		
		Vehicle vehicle3 = vehicleFactory.getVehicle("Bus");
		vehicle3.drive();
		
		
		Vehicle vehicle4 = vehicleFactory.getVehicle("van");
		vehicle4.drive();
	}

}
