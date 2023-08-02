package Test_15;
/* 
 * Date: Aug 2, 2023
 * Created by davisbug
 * 
 */
public class CheckContenatedSum {
    public static int checkConcatenatedSum(int n, int catlen) {
        int tempNum = n;
        int sum = 0;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            tempNum /= 10;
            for (int i = 1, j = 1; j <= catlen; i *= 10, j++) {
                sum += digit * i;
            }
        }
        if (n == sum) return 1;
        return 0;
    }

    public static void main(String[] args) {
        //Sample Tests
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
 
    }

    
}
