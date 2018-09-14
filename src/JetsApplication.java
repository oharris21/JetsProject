import java.util.Scanner;

public class JetsApplication {

	Airfield airfield = new Airfield();
	FighterJet fj = new FighterJet();
	CargoPlane cp = new CargoPlane();
	private Scanner sc = new Scanner(System.in);

	public JetsApplication() {

	}

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();
	}

	private void launch() {
		displayUserMenu1();
	}

	// user interface 
	private void displayUserMenu1() {
		System.out.println("--------------- MENU ---------------");
		System.out.println("|                                  |");
		System.out.println("| (1)  List fleet                  |");
		System.out.println("| (2)  Fly all jets                |");
		System.out.println("| (3)  View fastest jets           |");
		System.out.println("| (4)  View jet with longest range |");
		System.out.println("| (5)  Fighter jet fight	       |");
		System.out.println("| (6)  Load all cargo Jets         |");
		System.out.println("| (7)  Add a jet to fleet          |");
		System.out.println("| (8)  Fly a jet                   |");
		System.out.println("| (9)  Quit                        |");
		System.out.println("|                                  |");
		System.out.println("------------------------------------");
		int menuChoice = sc.nextInt();
		menuChoice(menuChoice);
	}

	// logic for menu choices
	public void menuChoice(int menuChoice) {
		while (menuChoice < 10) {
			if (menuChoice == 1) {
				airfield.listFleet();
			}
			if (menuChoice == 2) {
				airfield.fly();
			}
			if (menuChoice == 3) {
				airfield.viewFastest();
			}
			if (menuChoice == 4) {
				airfield.longestRange();
			}
			if (menuChoice == 5) {
				fj.fight();
				airfield.dogfight();
			}
			if (menuChoice == 6) {
				cp.loadCargo();
				airfield.cargo();
			}
			if (menuChoice == 7) {
				addJet();
			}
			if (menuChoice == 8) {
				submenu();
			}
			if (menuChoice == 9) {
				System.out.println("... Goodbye ...");
				System.exit(0);
			}
			displayUserMenu1();
		}
	}

	// logic for menu choice 7 
	public void addJet() {
		System.out.println("Welcome to the hanger. Here, you can customize your own jet and be in the air in no time!");

		System.out.print("What's the model? ");
		String custModel = sc.next();

		System.out.print("What's it's top speed (in MPH)? ");
		String customizedSpeed = sc.next();
		double custSpeed = Double.parseDouble(customizedSpeed);

		System.out.print("How about is it's range? ");
		String customizedRange = sc.next();
		int custRange = Integer.parseInt(customizedRange);

		System.out.print("And lastly, how much does it cost? ");
		String customizedPrice = sc.next();
		long custPrice = Long.parseLong(customizedPrice);

		Jet jet = new JetImpl(custModel, custSpeed, custRange, custPrice, airfield.assignRandomPilot());
		airfield.addJetToAirfield(jet);
	}

	// logic for menu choice 8 
	public void submenu() {
		Jet[] jets = airfield.getJets();
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.print(i + 1 + " " + jets[i] + "\n");
				System.out.print("Pilot: " + jets[i].getPilot().getFirstName() + " ");
				System.out.print(jets[i].getPilot().getLastName() + " ");
				System.out.println(jets[i].getPilot().getYearsOfExperience() + "\n");
			}
		}
		
		System.out.print("\nWhich jet would you like to fly? ");
		int jetChoice = sc.nextInt();
		airfield.flyIndividualJet(jetChoice);
	}
}