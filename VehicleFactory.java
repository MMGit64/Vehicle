
public class VehicleFactory {
	
	public Vehicle getVehicle(String vehicleType) {
		if (vehicleType == null) {
			return null;
		}
		
		if (vehicleType.equalsIgnoreCase("car")) {
			return new Car();
		}
		
		else if (vehicleType.equalsIgnoreCase("motorbike")) {
			return new Motorbike();
		}
	
		else if (vehicleType.equalsIgnoreCase("bus")) {
			return new Bus();
		}
	
		else if (vehicleType.equalsIgnoreCase("van")) {
			return new Van();
		}
	
		return null;
	}

}
