package Test_10;
/* 
 * Date: Jul 29, 2023
 * Created by davisbug
 * 
 */

 public class Isolated{
   public static int isIsolated(long n) {
      if (n >= 2097151 || n < 1) return -1;
      long square = n * n;
      long cube = n * n * n;
      while (cube > 0) {
          long cubeDigit = cube % 10;
          cube /= 10;

          long tempSquare = square;
          while (tempSquare > 0) {
              long squareDigit = tempSquare % 10;
              tempSquare /= 10;

              if (squareDigit == cubeDigit)
                  return 0;
          }
      }

      return 1;
   }
   public static void main(String[] args) {
      //Test cases
      System.out.println(isIsolated(69));
      System.out.println(isIsolated(2));
      System.out.println(isIsolated(4));
   }
 }
