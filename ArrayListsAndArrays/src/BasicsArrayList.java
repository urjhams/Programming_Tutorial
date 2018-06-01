import java.util.ArrayList;

public class BasicsArrayList {
//beginner

	//todo: write some methods for basic operations with ArrayLists:
	//-write a method where you can add a certain value to an ArrayList
	//-write a method which prints all the values in an ArrayList

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		appendInto(myList, "one");
		printOut(myList);
	}
	private static void appendInto(ArrayList<String> input, String value) {
		int current = input.size();
		input.add(current, value);
		// cannot use set method cause cannot set the size of an ArrayList -> OutBoundException
	}

	private static void printOut(ArrayList<String> input) {
		for (String item : input) {
			System.out.println(item);
		}
	}

}
