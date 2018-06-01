//Bonus 2D Arrays
public class MagicSquare {
	/*
	 * Todo: A magic square is a quadratic matrix where the sums of each row and
	 * each column are equal. All possible numbers from 1 to (side length)^2 have to occur
	 * in the square. Write a method that takes a 2D Array as input and checks if it is a magic
	 * square or not.
	 * */

   public static void main(String[] args) {
     int[][] magicSquare = {
       {2,7,6},
       {9,5,1},
       {4,3,8}
     };
    System.out.println(isMagicSquare(magicSquare));
   }

   private static boolean isMagicSquare(int[][] inputSquare) {
     int sumToCompare = 0;
     for (int index = 0; index < inputSquare.length; index++) {
       sumToCompare += inputSquare[index][index];
     }

     /* ----------------------------here we scan through each row and each column
     for (int index = 0; index < inputSquare.length; index++) {
       int rowSum = 0;
       for (int elementIndex = 0; elementIndex < inputSquare.length; elementIndex++) {
         rowSum += inputSquare[index][elementIndex];
       }
       if (rowSum != sumToCompare) {
         return false;
       }
       rowSum = 0;
     }

     for (int index = 0; index < inputSquare.length; index++) {
       int colSum = 0;
       for (int elementIndex = 0; elementIndex < inputSquare.length; elementIndex++) {
         colSum += inputSquare[elementIndex][index];
       }
       if (colSum != sumToCompare) {
         return false;
       }
       colSum = 0;
     }
     */

     //------------- so the for loops above can group as:
     for (int index = 0; index < inputSquare.length; index++) {
       int rowSum = 0;
       int colSum = 0;
       for (int elementIndex = 0; elementIndex < inputSquare.length; elementIndex++) {
         rowSum += inputSquare[index][elementIndex];
         colSum += inputSquare[elementIndex][index];
       }
       if (colSum != sumToCompare != rowSum != sumToCompare) {
         return false;
       }
       colSum = 0;
       rowSum = 0;
     }
     return true;
   }
}
