import java.text.DecimalFormat;

public class Airfield {
	private Jet[] jets = new Jet[20];
	private Pilot[] pilots = new Pilot[5];

	// pilots available for created jets
	private void populatePilots() {
		pilots[0] = new Pilot("Ed", "Norman", 35);
		pilots[1] = new Pilot("Cindy", "Houston", 40);
		pilots[2] = new Pilot("Bryson", "Smith", 30);
		pilots[3] = new Pilot("Mandy", "Berry", 20);
		pilots[4] = new Pilot("Kurt", "Berman", 25);
	}

	// pre made jets and pilots
	private void populateAirfield() {
		jets[0] = new CargoPlane("FedEx Air", 600.0, 1000, 4_000_000, new Pilot("Ted", "Jones", 10));
		jets[1] = new CargoPlane("UPS Freight", 400.0, 1000, 2_000_000, new Pilot("Barbara", "Wilson", 20));
		jets[2] = new CargoPlane("USPS Air Mail", 500.0, 8000, 3_000_000, new Pilot("Joe", "Nelson", 15));
		jets[3] = new FighterJet("Stealth", 800.0, 600, 10_000_000, new Pilot("Mike", "Martinez", 5));
		jets[4] = new FighterJet("F-16", 900.0, 500, 15_000_000, new Pilot("Ashley", "Adams", 20));
		jets[5] = new FighterJet("F-14 Tomcat", 1_000.0, 400, 20_000_000, new Pilot("Luke", "Johnson", 25));
	}

	public Airfield() {
		populatePilots();
		populateAirfield();
	}

	public void addJetToAirfield(Jet jet) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = jet;
				jet.setPilot(assignRandomPilot());
				break;
			}
		}
	}
	
	// logic for menu choice 1 
	public void listFleet() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i]);
				System.out.print("Pilot: " + jets[i].getPilot().getFirstName() + " ");
				System.out.print(jets[i].getPilot().getLastName() + " ");
				System.out.println(jets[i].getPilot().getYearsOfExperience());
			}
		}
	}
	
	// logic for menu choice 2 
	public void fly() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				double time = jets[i].getRange() / jets[i].getSpeed();
				double printTime = RoundToTwoDecimals(time);
				System.out.println(jets[i] + "\nFlight Time: " + printTime + " hours");
				System.out.print("Pilot: " + jets[i].getPilot().getFirstName() + " ");
				System.out.print(jets[i].getPilot().getLastName() + " ");
				System.out.println(jets[i].getPilot().getYearsOfExperience());
			}
		}
	}

	// logic for menu choice 3 
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
		System.out.print("Pilot: " + fastestJet.getPilot().getFirstName() + " ");
		System.out.print(fastestJet.getPilot().getLastName() + " ");
		System.out.println(fastestJet.getPilot().getYearsOfExperience());
	}

	// logic for menu choice 4
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
		System.out.print("Pilot: " + longestRange.getPilot().getFirstName() + " ");
		System.out.print(longestRange.getPilot().getLastName() + " ");
		System.out.println(longestRange.getPilot().getYearsOfExperience());
	}

	// logic for menu choice 5 
	public void dogfight() {
		// choose only fighter jets for the dogfight
		Jet[] fighterJets = new Jet[jets.length];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] instanceof FighterJet) {
				fighterJets[i] = jets[i];
			}
		}
		// return a random fighter jet
		Jet j = null;
		while (j == null) {
			int randomNumber = (int) (Math.random() * (fighterJets.length - 1) + 1);
			int randomJet = 0;
			for (int i = 1; i < fighterJets.length; i++) {
				if (i == randomNumber) {
					randomJet = i;
				}
			}
			j = fighterJets[randomJet];
		}
		System.out.println(j.getModel() + " is the winner!");
		System.out.println("Here's some more information about it.");
		System.out.println(j);
		System.out.print("Pilot: " + j.getPilot().getFirstName() + " ");
		System.out.print(j.getPilot().getLastName() + " ");
		System.out.println(j.getPilot().getYearsOfExperience());
	}
	
	// logic for menu choice 8 
	public void flyIndividualJet(int whichJet) {
		int jetToFly = whichJet - 1;
		if (jets[jetToFly] != null) {
			double time = jets[jetToFly].getRange() / jets[jetToFly].getSpeed();
			double printTime = RoundToTwoDecimals(time);
			System.out.println(jets[jetToFly] + "\nFlight Time: " + printTime + " hours");
			System.out.print("Pilot: " + jets[jetToFly].getPilot().getFirstName() + " ");
			System.out.print(jets[jetToFly].getPilot().getLastName() + " ");
			System.out.println(jets[jetToFly].getPilot().getYearsOfExperience());
		}
	}

	public double RoundToTwoDecimals(double val) {
		DecimalFormat df = new DecimalFormat("###.##");
		double newFormat = Double.valueOf(df.format(val));
		return newFormat;
	}

	public Jet[] getJets() {
		return jets;
	}

	// assigns random pilot to created jets 
	public Pilot assignRandomPilot() {
		int randomNumber = (int) (Math.random() * (5 - 1) + 1);
		int randomPilot = 0;
		for (int i = 1; i < pilots.length; i++) {
			if (i == randomNumber) {
				randomPilot = i;
			}
		}
		return pilots[randomPilot];
	}

	public Pilot[] getPilots() {
		return pilots;
	}

	// choose only cargo jets to load cargo
	public void cargo() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] instanceof CargoPlane) {
				System.out.println(jets[i]);
				System.out.print("Pilot: " + jets[i].getPilot().getFirstName() + " ");
				System.out.print(jets[i].getPilot().getLastName() + " ");
				System.out.println(jets[i].getPilot().getYearsOfExperience());
				System.out.println("Is loading its cargo.");
			}
		}
	}
}