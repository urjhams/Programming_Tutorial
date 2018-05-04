
public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
  public static void main(String[] args) {
    System.out.println("Enter the number:");
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    System.out.println(factorial(a));
  }

  private int factorial(int from) {
    if (from < 1) {
      return 1;
    } else {
      return from * factorial(from - 1);
    }
  }

  /*
  ex: factorial of 5
  5 * factorial(4) ---- mean 5 - 1
  4 * factorial(3) ---- mean 4 - 1
  3 * factorial(2) ---- mean 3 - 1
  2 * factorial(1) ---- mean 2 - 1
  1                ---- factorial(1) is 1
  */
}
