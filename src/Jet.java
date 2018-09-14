
public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	private Pilot pilot; 

	// end of fields 
	
	public Jet() {
		
	}

	public Jet(String model, double speed, int range, long price, Pilot pilot) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.pilot = pilot; 
	}

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Pilot getPilot() {
		return pilot;
	}
	
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public String toString() {
		return "\nModel: " + model + "\nSpeed: " + speed + " mph" + "\nRange: " + range + " mi" + "\nPrice: " + "$" + price;
	}
}