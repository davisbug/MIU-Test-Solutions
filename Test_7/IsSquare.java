package Test_7;
/* 
 * Date: Jul 28, 2023
 * Created by davisbug
 * 
 */
public class IsSquare {
    public static int isSquare(int n){
        for (int i = 0; i <= n; i++) {
            if ( i * i == n) {
                 return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        //Test cases
        System.out.println(isSquare(0));
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(8));
        System.out.println(isSquare(-4));

    }

    
}
