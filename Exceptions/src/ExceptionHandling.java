
public class ExceptionHandling {
	public static void main(String[] args) {
		//todo:
		//1.) Execute the following program. It will throw Exceptions.
		//Catch the Exceptions using their proper Names till no further
		//exceptions occur.
		//
		//2.) Taking the square root of a negative number won't cause
		//the exception. Write your own Exception for this case and
		//write a method which throws this exception
		int a = 5;
		int b = 0;
		try {
			int div = a/b;
		} catch(ArithmeticException exception) {
			System.err.println("ArithmeticException appear");
			exception.printStackTrace();
		}


		int[] arr = new int[5];
		try {
			arr[5] = 7;
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.err.println("ArrayIndexOutOfBoundsException appear");
			exception.printStackTrace();
		}

		String one = "one";
		try {
			int i = Integer.parseInt(one);
		} catch (NumberFormatException exception) {
			System.err.println("NumberFormatException appear");
			exception.printStackTrace();
		}

		double c = -7.0;
		try {
			double d = getSquareRootOf(c);
			System.out.println(d);
		} catch (NegativeArgumentException exception) {
			System.err.println("NegativeArgumentException appear");
			exception.printStackTrace();
		}
	}
	private static Double getSquareRootOf(double number) throws NegativeArgumentException {
		if (Double.isNaN(Math.sqrt(number))) {
			throw new NegativeArgumentException();
		}
		return Math.sqrt(number);
	}
}
