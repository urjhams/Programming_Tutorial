
public class Driver {

	public static void main(String[] args) {
		//todo: create at least 1 student, 1 professor and one lecture
		// add the lecture to the student and the professor
		Student student = new Student();
		Professor prof = new Professor();
		Lecture lecture = new Lecture();
		student.addLecture(lecture);
		prof.addLecture(lecture);

		// extra: the "args" here is for command-line argument in java
		for (String argumentMember : args) {
			System.out.println("args member: " + argumentMember);
		}
	}
}
