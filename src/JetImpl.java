
import java.util.Scanner;

public class JetImpl extends Jet { 

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public JetImpl addJet() {
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
		
		JetImpl ji = new JetImpl(customizedPrice, custSpeed, custRange, custPrice); 
		
		return ji; 
		
	}

}