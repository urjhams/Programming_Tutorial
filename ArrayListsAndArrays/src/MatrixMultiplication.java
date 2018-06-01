import java.util.Arrays;
//2D Arrays
public class MatrixMultiplication {

	//Todo: Each 2D Array can be treated like a matrix.
	//Write a method which takes two matrices as input and returns the result.
	//Write a main-method where you call your created method for matrix multiplication
	//and print the result properly
	
	public static void main(String[] args) {
			int[] ar1 = {1,2,3,4};
			int[] ar2 = {5,6,7};
			int[][] array = createMatrix(ar1,ar2);
	}

	private static int[][] createMatrix(int[] array1, int[] array2) {
		int[][] result = {array1,array2};
		for (int index = 0; index < result.length; index ++) {
			System.out.println(Arrays.toString(result[index]));
		}
		return result;
	}
}
