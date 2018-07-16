import java.util.Scanner;

public class JetsApplication {

	Airfield airfield = new Airfield(); 
	FighterJet fj = new FighterJet("-", 1, 1, 1); 
	CargoPlane cp = new CargoPlane("---", 1, 1, 1); 
	
	private Scanner sc = new Scanner(System.in); 
	
	public JetsApplication() {
		
	}
	
	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication(); 	
	
		ja.launch(); 
		
	}
	
	private void launch() {
		displayUserMenu(); 
	}
	
	private void displayUserMenu() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("-------------- MENU ---------------");
		System.out.println("|                                 |");
		System.out.println("| (1) List fleet                  |");
		System.out.println("| (2) Fly all jets                |");
		System.out.println("| (3) View fastest jets           |");
		System.out.println("| (4) View jet with longest range |");
		System.out.println("| (5) Fighter jet fight	          |"); 
		System.out.println("| (6) Load all cargo Jets         |");
		System.out.println("| (7) Dogfight!                   |");
		System.out.println("| (8) Add a jet to fleet          |");
		System.out.println("| (9) Quit                        |");
		System.out.println("|                                 |");
		System.out.println("-----------------------------------");
		
		int menuChoice = sc.nextInt(); 
		
		if (menuChoice == 1) {
			airfield.listFleet(); 
			displayUserMenu();
		}
		if (menuChoice == 2) {
			airfield.fly(); 
			displayUserMenu();
		}
		if (menuChoice == 3) {
			airfield.viewFastest();
			displayUserMenu();
		}
		if (menuChoice == 4) {
			airfield.longestRange(); 
			displayUserMenu();
		}
		if (menuChoice == 5) {
			fj.fight(); 
			displayUserMenu();
		}
		if (menuChoice == 6) {
			cp.loadCargo(); 
			displayUserMenu();
		}
		if (menuChoice == 7) {
			System.out.println("Check back soon for this feature!"); 
			displayUserMenu();
		}
		if (menuChoice == 8) {
			 addJet();
			displayUserMenu();
		}
		if (menuChoice == 9) {
			System.out.println("... Goodbye ...");
			System.exit(0); 
		}
	}
	
	public void addJet() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the hanger. Here, you can customize your own jet and be in the air in no time!");

		System.out.print("What's the model? ");
		String custModel = sc.nextLine();

		System.out.print("What's it's top speed (in MPH)? ");
		String customizedSpeed = sc.next();
		double custSpeed = Double.parseDouble(customizedSpeed);

		System.out.print("How about is it's range? ");
		String customizedRange = sc.next();
		int custRange = Integer.parseInt(customizedRange);

		System.out.print("And lastly, how much does it cost? ");
		String customizedPrice = sc.next();
		long custPrice = Long.parseLong(customizedPrice);
		
		Jet ji = new JetImpl(custModel, custSpeed, custRange, custPrice);
		
		airfield.addJetToAirfield(ji);
	}
	
	
}
