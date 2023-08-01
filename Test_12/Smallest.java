package Test_12;
/* 
 * Date: Aug 1, 2023
 * Created by davisbug
 * 
 */
public class Smallest {
    public static int smallest(int n){
        int num = 1;
        while (true) {
            boolean flag = false;
            for (int i = 1; i <= n; i++) {
                flag = false;
                int product = num * i;
                while (product > 0) {
                    int digit = product % 10;
                    product /= 10;
                    if (digit == 2) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    break;
            }
            if (flag) return num;
            num++;
        }

    }
    public static void main(String[] args) {
        //Test cases
        System.out.println(smallest(7));
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
    }

    
}
