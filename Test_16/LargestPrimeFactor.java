package Test_16;
/* 
 * Date: Aug 2, 2023
 * Created by davisbug
 * 
 */
public class LargestPrimeFactor {
    public static int largestPrimeFactor(int n){
        int largestPrimeFactor = 2;

        if (n <= 1) return 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
            }
        }
        return largestPrimeFactor;
            
        }
 
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return n > 0;
    }

    public static void main(String[] args) {
        //Test samples
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }
}
