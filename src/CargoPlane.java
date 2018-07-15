
public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price); 
	}

	@Override
	public void loadCargo() {
		System.out.println("Let's load some packages into our cargo planes!");
	}
	
}
