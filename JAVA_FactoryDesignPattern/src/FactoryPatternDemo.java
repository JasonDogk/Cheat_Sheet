
public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle vehicle1 = vehicleFactory.getVehicle("CAR");
		vehicle1.startEngine();
	
		Vehicle vehicle2 = vehicleFactory.getVehicle("TRUCK");
		vehicle2.startEngine();
		
		Vehicle vehicle3 = vehicleFactory.getVehicle("MOTORCYCLE");
		vehicle3.startEngine();
		
		Vehicle vehicle4 = vehicleFactory.getVehicle(null);
		if(vehicle4 != null) {
			vehicle4.startEngine();
		} else {
			System.out.println("Provided vehicle is null");
		}
			
		
		Vehicle vehicle5 = vehicleFactory.getVehicle("");
		if(vehicle5 != null) {
			vehicle5.startEngine();
		} else {
			System.out.println("Provided vehicle is null");
		}
	}
	

}
