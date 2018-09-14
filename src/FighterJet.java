
public class FighterJet extends Jet implements CombatReady {
	
	public FighterJet() {
		
	}
	
	public FighterJet(String model, double speed, int range, long price, Pilot pilot) {
		super(model, speed, range, price, pilot); 
	}
	
	public void fight() {
		System.out.println("The fighter jets are preparing to fight!\n");
	}
	
}
