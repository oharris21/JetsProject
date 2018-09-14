
public class CargoPlane extends Jet implements CargoCarrier {
	
	public CargoPlane() {
		
	}
	
	public CargoPlane(String model, double speed, int range, long price, Pilot pilot) {
		super(model, speed, range, price, pilot); 
	}

	@Override
	public void loadCargo() {
		System.out.println("Time to load up our cargo planes!");
	}
	
}
