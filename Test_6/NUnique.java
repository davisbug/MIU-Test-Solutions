package Test_6;
/* 
 * Date: Jul 28, 2023
 * Created by davisbug
 * 
 */

public class NUnique {
    public static int isNUnique(int[] a, int n){
        if (a.length >= 2) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] + a[j] == n)
                        count++;
                    if (count > 1) return 0;
                }
            }

            if (count == 1) return 1;
            else return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        //Test cases
        int[] array = {2, 7, 3, 4};
        System.out.println(isNUnique(array, 5));
        System.out.println(isNUnique(new int[] {7, 3, 3, 2, 4}, 6));
        System.out.println(isNUnique(new int[] {7, 3, 3, 2, 4}, 11));
        System.out.println(isNUnique(new int[] {7, 3, 3, 2, 4}, 4));
    }
    
}
