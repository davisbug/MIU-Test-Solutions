package Test_15;
/* 
 * Date: Aug 2, 2023
 * Created by davisbug
 * 
 */
public class LargestAdjacentSum {
    public static int largestAdjacentSum(int[ ] a){
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] > sum) {
                sum = a[i] + a[i + 1];
            }
        }
        return sum;
    }
    

    public static void main(String[] args) {
        //Test Cases
        int[] array = {0, 9, 12, 18, 4};
        System.out.println(largestAdjacentSum(array));
        System.out.println(largestAdjacentSum(new int[] {1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[] {18, -12, 9, -10}));
    }
}
