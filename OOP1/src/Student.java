import java.util.ArrayList;


public class Student {
	private String name;
	private int matrNr;
	private ArrayList lectures = new ArrayList();

	//todo: write a constructur that already gives the student a name and a matriculation number

	//todo: write getter and setter methods

	//constructor
	public Student() {
		this.name = "default name";
		this.matrNr = 0;
		System.out.println("student created");
	}

	//getter & setter
	public String getName() { return this.name; }
	public int getMatrNr() { return this.matrNr; }
	public ArrayList getLectures() { return this.lectures; }
	public void setName(String name) { this.name = name; }
	public void setMatrNr(int matrNr) { this.matrNr = matrNr; }

	public void addLecture(Lecture lecture) {
		//todo: fill this method
		this.lectures.add(lecture);
		System.out.println("lecture added to student");
	}
}
