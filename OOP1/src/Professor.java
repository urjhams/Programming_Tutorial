import java.util.ArrayList;


public class Professor {
	private String name;
	private String chair;
	private ArrayList lectures = new ArrayList();

	//todo: write a constructur that already gives the professor a name and a chair

	//todo: write getter and setter methods

	//constructor
	public Professor() {
		this.name = "default professor name";
		this.chair = "default professor chair";
		System.out.println("professor created");
	}

	//getter & setter
	public String getName() { return this.name; }
	public String getChair() { return this.chair; }
	public ArrayList getLectures() { return this.lectures; }
	public void setName(String name) { this.name = name; }
	public void setChair(String chair) { this.chair = chair; }

	public void addLecture(Lecture lecture){
		//todo: fill this method
		this.lectures.add(lecture);
		System.out.println("lecture added to professor");
	}
}
