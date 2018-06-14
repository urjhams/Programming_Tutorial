public class mainClass {
  public static void main(String[] args) {
    Pair<Double,String> instance = new Pair(1.0,"second");
    System.out.println("first: " + instance.getFirst().toString() + "\t second: " + instance.getSecond());
  }
}
