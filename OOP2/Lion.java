import java.util.Date;

public class Lion extends Animal implements Predator {
	public Lion(String name, Date birthday, boolean isFemale) {
		super.name = name;
		super.birthday = birthday;
		super.isFemale = isFemale;
	}

	//getter
	public String getName() { return super.name; }
	public Date getBirthday() { return super.birthday; }
	public String getGender() { return super.isFemale ? "Female" : "Male"; }

	public saySomething() {
		super.saySomething();
		System.out.println("function saysomething was call from super class");
	}

	public void warningPlate() {
		System.out.println("warningPlate funtion in Lion class");
	}
}
