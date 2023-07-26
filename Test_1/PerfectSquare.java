package Test_1;
/* 
 * Date: Jul 26, 2023
 * Created by davisbug
 * 
 */
 public class PerfectSquare{
    public static int isPerfectSquare(int n){
        
        int next;
        next = (int) Math.sqrt(n) + 1;

        if (n < 0) return 0;
     
        return next * next;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(-1));
    }
 }