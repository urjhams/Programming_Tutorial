
public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("Enter the number:");
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    printFibonaci(a);
  }

  private void printFibonaci(int range) {
    for (int start = 0; start < range; start ++) {
      System.out.println(initFibonaci(start));
      System.out.print("  ");
    }
  }

  private int initFibonaci(int range) {
    switch (range) {
      case 0:
        return 0;
      case 1:
        return 1;
      default:
        return initFibonaci(range - 1) + initFibonaci(range - 2);
    }
  }

	//todo: implement a recursive function which takes an integer value as inputs and outputs the corresponding Fibonacci number.
	//if you don't know what Fibonacci numbers are you can read it here: https://en.wikipedia.org/wiki/Fibonacci_number
}
