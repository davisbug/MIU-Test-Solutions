package Test_13;
/* 
 * Date: Aug 1, 2023
 * Created by davisbug
 * 
 */
public class FullnessQuotient {
    public static int fullnessQuotient(int n) {
        if (n < 1)
            return -1;

        int count = 0;

        for (int base = 2; base <= 9; base++) {
            boolean zeroFlag = false;
            int number = n;
            while (number > 0) {
                if (number % base == 0) {
                    zeroFlag = true;
                    break;
                }
                number /= base;
            }

            if (!zeroFlag)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        //Test Cases
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(360));
    }
}
