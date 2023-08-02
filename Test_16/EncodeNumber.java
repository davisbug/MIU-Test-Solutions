package Test_16;
import java.util.Arrays;
/* 
 * Date: Aug 2, 2023
 * Created by davisbug
 * 
 */
public class EncodeNumber {
    public static int[] encodeNumber(int n) {
        if (n <= 1)
            return null;

        int size = 0;
        int nCopy = n;
        for (int i = 2; i <= nCopy; ) {
            if (isPrime(i) && nCopy % i == 0) {
                size++;
                nCopy /= i;
            } else i++;
        }

        int[] result = new int[size];
        nCopy = n;

        for (int i = 0, j = 2; i < size && j <= nCopy; ) {
            if (isPrime(j) && nCopy % j == 0) {
                result[i] = j;
                i++;
                nCopy /= j;
            } else j++;
        }

        return result;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return n > 0;
    }
    public static void main(String[] args) {
        //Test cases
        System.out.println(Arrays.toString(encodeNumber(6936)));
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
    }
}