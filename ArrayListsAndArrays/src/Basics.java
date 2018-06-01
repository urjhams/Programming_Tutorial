
import java.util.Arrays;

public class Basics {
//beginner

	//todo: write some methods for some basic operations with arrays, like:
	//-return the length of an array
	//-drop the last element of an array
	//-sum up all the elements of an integer array
	//-check if an array contains a given element

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		System.out.println("Input array: " + Arrays.toString(myArray));
		returnLenghtOf(myArray);
		dropLastElementOf(myArray);
		sumOf(myArray);
		int givenElement = 5;
		System.out.println("The array" + (hasGivenElement(myArray, givenElement) ? " " : " not ") + "contains " + givenElement);
	}

	private static void returnLenghtOf(int[] input) {
		System.out.println("length: " + input.length);
	}

	private static void dropLastElementOf(int[] input) {
		int[] newArray = new int[input.length - 1];
		for (int index = 0; index < newArray.length; index++) {
			newArray[index] = input[index];
		}
		System.out.println("After drop last element: " + Arrays.toString(newArray));
	}

	private static void sumOf(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			sum += input[index];
		}
		System.out.println("Sum of all elements: " + sum);
	}

	private static boolean hasGivenElement(int[] input, int givenElement) {
		boolean result = false;
		for (int element : input) {
			if (element == givenElement) {
				result = true;
			}
		}
		return result;
	}
}
