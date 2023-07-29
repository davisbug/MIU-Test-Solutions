package Test_9;
/* 
 * Date: Jul 29, 2023
 * Created by davisbug
 * 
 */
public class Stacked {
    public static int isStacked(int n){
        int sum = 0;
        if (n <= 0) return 0;
      
        for (int i = 0; i <= n; i++) {
            sum += i;
            if (sum == n) {
                return 1;
            }   
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isStacked(0));
        System.out.println(isStacked(10));
        System.out.println(isStacked(7));
    }
}