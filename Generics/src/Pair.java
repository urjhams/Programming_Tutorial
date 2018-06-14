
public class Pair<T,U> {
	//todo: In Java it is not possible to have two return values. Luckily you can use Generics to solve that problem.
	//Change this class to a Generic where you can have a pair of two Variables even with different data types.
	//Write a constructor for this class to set those values and also getter and setter methods to retrieve them and
	//test your Methods in a driver-class
  private T first;
  private U second;

  public Pair(T first, U second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst() {
    return this.first;
  }

  public U getSecond() {
    return this.second;
  }
}
