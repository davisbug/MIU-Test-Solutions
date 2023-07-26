package Test_3;
/* 
 * Date: Jul 26, 2023
 * Created by davisbug
 * 
 */

public class PorcupineNumber {
    public static int findPorcupineNumber(int number){
        int porcupineNumber = 0;
        int maxValue = Integer.MAX_VALUE;
        boolean isPorcupineNumber = false;
        number++;

        while (number <= maxValue) {
            if (isPorcupineNumber) {
                if (isPrime(number) == 1) {
                    if (number % 10 == 9) break;
                    else isPorcupineNumber = false;
                }
            } else {
                if (isPrime(number) == 1) {
                    if (number % 10 == 9) {
                        isPorcupineNumber = true;
                        porcupineNumber = number;
                    }
                }
            }
            number++;
        }
        return porcupineNumber;
    }

    public static int isPrime(int number) {
        int isPrime = 0;
        if (number > 1) {
            isPrime = 1;
            for (int i = 2; i*2 <= number; i++) {
                if (number % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        //Test cases
        System.out.println(findPorcupineNumber(138));
        System.out.println(findPorcupineNumber(139));

    }

    
}
