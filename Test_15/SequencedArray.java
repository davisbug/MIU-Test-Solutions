package Test_15;
/* 
 * Date: Aug 2, 2023
 * Created by davisbug
 * 
 */
public class SequencedArray {
    public static int isSequencedArray(int[] a, int m, int n){
        if (a.length <= 1 || a[0] != m || a[a.length - 1] != n || m > n)
            return 0;


        for (int i = m; i <= n; i++) {
            boolean flag = false;

            for (int j = 1; j <= a.length - 1; j++) {
                if (a[j - 1] > a[j]) {
                    return 0;
                }

                if (a[j - 1] == i || a[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        // Sample Tests
        int[] array = {1,2,3,4,5,6};
        System.out.println(isSequencedArray(array, 1, 6));
        System.out.println(isSequencedArray(new int[] {1,4,2,3,6}, 1, 6));
    }
}
