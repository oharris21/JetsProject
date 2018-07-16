
public class Airfield {

	private Jet[] jets = new Jet[20]; 
	
	private void populateAirfield() {
		jets[0] = new CargoPlane("FedEx Air", 600.0, 1000, 4_000_000); 
		jets[1] = new CargoPlane("UPS Freight", 400.0, 1000, 2_000_000); 
		jets[2] = new CargoPlane("USPS Air Mail", 500.0, 8000, 3_000_000); 
		jets[3] = new FighterJet("Stealth", 800.0, 600, 10_000_000); 
		jets[4] = new FighterJet("F-16", 900.0, 500, 15_000_000);
		jets[5] = new FighterJet("F-14 Tomcat", 1_000.0, 400, 20_000_000); 
		
	}
	
	public Airfield() {
		populateAirfield(); 
	}
	
	public void addJetToAirfield(Jet ji) {
		
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = ji; 
				break; 
			}
		}
	}
	
	public void listFleet() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
			System.out.println(jets[i]);
			}
		} 
	}
	
	public void viewFastest() {
		Jet fastestJet = jets[0]; 
		
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getSpeed() > fastestJet.getSpeed()) {
					fastestJet = jets[i]; 
				} 
			}
		} 
			System.out.println(fastestJet.getModel() + " is the fastest jet.");
			System.out.println("Here's some more information about it.");
			System.out.println(fastestJet); 
	}
	
	public void longestRange() {
		Jet longestRange = jets[0]; 
		
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getRange() > longestRange.getRange()) {
					longestRange = jets[i]; 
				} 
			}
		} 
				System.out.println(longestRange.getModel() + " has the longest range.");
				System.out.println("Here's some more information about it.");
				System.out.println(longestRange);
	}
	
	public void fly() {
		
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				double time = jets[i].getRange() / jets[i].getSpeed(); 
				String time1 = Double.toString(time); 
				System.out.println(jets[i] + "\nFlight Time: " + time1 + " hours");
			}
		} 
	}
} 
