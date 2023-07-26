package TestTwo;

/* 
 * Date: Jul 26, 2023
 * Created by davisbug
 * 
 */

 public class PrimeCount{
    public static int primeCount(int start, int end){
        int primeCount = 0, prime;

        if (start < 2 || end < 2) return 0;
        for (int iNum = start; iNum <= end ; iNum++) {
            if(iNum == 2) {
                primeCount++;
                continue;
            }
            prime = 1;
            for(int jNum = 2; jNum < iNum; jNum++) {
                if(iNum % jNum == 0) {
                    prime = 0;
                    break;
                }
            }
            if(prime == 1) 
              primeCount++ ;
        }
    
        return primeCount;
    }


    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(6, 2));
    }
 }