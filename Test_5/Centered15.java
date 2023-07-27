package Test_5;
/* 
 * Date: Jul 27, 2023
 * Created by davisbug
 * 
 */
public class Centered15 {
    public static int isCentered15(int[] a){
        int sumElements;
        for (int i = 0; i <=(a.length / 2); i++) {
            sumElements = 0;
            for (int j = i; j < (a.length - i); j++) {
                sumElements += a[j];
            }
            if (sumElements == 15) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        //Test cases
        int[] array = {1,1,8, 3, 1, 1};
        System.out.println(isCentered15(array));
        System.out.println(isCentered15(new int[] {2, 10, 4, 1, 6, 9}));

    }
 
     

 
}
