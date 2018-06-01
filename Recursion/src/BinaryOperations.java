
public class BinaryOperations {
	/*
	 * BONUS: Write two recursive methods. One for adding binary numbers and one for
	 * subtracting them.
   String s = "1011010"
	 */
   @Nullable
   private String sum2Binaries(String bin1, String bin2, int countDown,int remember) {
     if (countDown == null) {
       countDown = bin1.length();
       if (bin2.length() > countDown) {
         countDown = bin2.length();
       }
     }
     if (countDown == 0) {
       if (remember == 0) {
         return bin1;
       } else {           // here must be equal 1 if not equal 0
         return "1" + bin1;
       }
     } else {
       int localRemember = 0;
       int swapResultElement = 0;
       countDown1 = countDown;
       countDown2 = countDown;
       if (bin1.length() < bin2.length()) {
         countDown1 = countDown1 - (bin2.length() - bin1.length());
       } else {
         countDown2 = countDown2 - (bin1.length() - bin2.length());
       }
       String bin1Element = bin1.charAt(countDown1 - 1);   // cause now it index of Array (so less than length 1)
       String bin2Element = bin2.charAt(countDown2 - 1);
     }
   }
   private String subtract2Binaries(String bin1, String bin2) {
     return "";
   }

}
