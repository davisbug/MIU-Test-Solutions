package Test_8;
/* 
 * Date: Jul 29, 2023
 * Created by davisbug
 * 
 */
public class ArrayHasNoZeroes {
    public static int arrayHasNoZeroes(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                return 0;
            }
           
        }
        return 1;
    }

    public static void main(String[] args) {
        //Test cases

        int[] array = {};
        System.out.println(arrayHasNoZeroes(array));
        System.out.println(arrayHasNoZeroes(new int[] {1,2,3}));
        System.out.println(arrayHasNoZeroes(new int[] {1,0,3,0,7}));
        System.out.println(arrayHasNoZeroes(new int[] {1,0,5,6,3}));

    }
}
