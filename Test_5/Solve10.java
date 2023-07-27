package Test_5;
/* 
 * Date: Jul 27, 2023
 * Created by davisbug
 * 
 */
public class Solve10 {
    public static int[] solve10() {
        int factorialX = 1;
        int factorialY = 1;
        int x = 1;
        int y = 1;
        boolean matched = false;
        int tenFactorial = 1;
        int[] result = new int[2];

        for (int i = 1; i <= 10; i++) {
            tenFactorial *= i;
        }

        for (x = 1; x <= 10 && !matched; x++) {
            factorialX *= x;
            factorialY = 1;
            for (y = 1; y <= 10 && !matched; y++) {
                factorialY *= y;
                if (tenFactorial == factorialX + factorialY) {
                    matched = true;
                    break;
                }
            }
        }

        if (matched) {
            result[0] = x;
            result[1] = y;
        } else {
            result[0] = 0;
            result[1] = 0;
        }
      
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Solve 10, value: {}"+ solve10());
    }

    
}
