package Test_3;
/* 
 * Date: Jul 26, 2023
 * Created by davisbug
 * 
 */

public class GuthrieSequence {
    public static int isGuthrieSequence(int[] a){

        int isGuthrieSequence = 1;
        if (a[a.length - 1 ] != 1) return 0;

        int[] guthrieArray = new int[a.length];
        guthrieArray[0] = a[0];
        guthrieArray[guthrieArray.length - 1] = a[a.length - 1];

        for (int i = 0, idx = 1; i <= a.length - 2; i++, idx++) {
            if (a[i] % 2 == 0)
                guthrieArray[idx] = a[i]/2;
            else
                guthrieArray[idx] = a[i]*3 + 1;
        }

        for (int i = 0; i < guthrieArray.length; i++) {
            if (guthrieArray[i] != a[i]) {
                isGuthrieSequence = 0;
                break;
            }
        }


        return isGuthrieSequence;

    }
    public static void main(String[] args) {
        //Test cases
        System.out.println(isGuthrieSequence(new int[] {8, 4, 2, 1}));
        System.out.println(isGuthrieSequence(new int[] {8, 17, 4, 1}));
        System.out.println(isGuthrieSequence(new int[] {8, 4, 1}));
        System.out.println(isGuthrieSequence(new int[] {8, 4, 2}));
    }


}
