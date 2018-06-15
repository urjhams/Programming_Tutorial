
public class Lecture {
	private String name;
	private double credits;

	//todo: write a constructor which already takes a name and credits

	//todo: write getter and setter methods

	public Lecture() {
		this.name = "default lecture name";
		this.credits = 1.0;
		System.out.println("lecture created");
	}

	public Lecture(String name, double credits) {
		this.name = name;
		this.credits = credits;
	}

	public String getName() {
		return this.name;
	}

	public double getCredits() {
		return this.credits;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}
}
