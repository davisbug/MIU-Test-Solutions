package TestOne;
/* 
 * Date: Jul 26, 2023
 * Created by davisbug
 * 
 */

public class UpCount {
    public static int nUpCount(int[] a, int n) {
        int upCount = 0;
        int previousPartialSum = 0;
        int currentPartialSum = 0;

        for (int i = 0; i < a.length; i++) {
            previousPartialSum = currentPartialSum;
            currentPartialSum += a[i];
            if (previousPartialSum <= n && currentPartialSum > n) {
                upCount += 1;
            }
        }
        return upCount;
        
    }

    public static void main(String[] args) {
        int[] array = { 6, 3, 1 };
        int[] array2 = {1,2,-1,5,3,2,-3};
        System.out.println(nUpCount(array,3));
        System.out.println(nUpCount(array2, 1));
        System.out.println(nUpCount(new int[]{4,1,1,-6,8,-3,-1,2}, 5));
    }
}
