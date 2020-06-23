
public class VehicleFactory {

	public Vehicle getVehicle(String vehicleType) {
		
		if(vehicleType == null) {
			return null;
		} else if("truck".equalsIgnoreCase(vehicleType)) {
			return new Truck();
		} else if("car".equalsIgnoreCase(vehicleType)) {
			return new Car();
		} else if("motorcycle".equalsIgnoreCase(vehicleType)) {
			return new Motorcycle();
		} else {
			return null;
		}
		
	}
}
