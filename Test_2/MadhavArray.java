package Test_2;

/* 
 * Date: Jul 26, 2023
 * Created by davisbug
 * 
 */

public class MadhavArray {
    public static int isMadhavArray(int[] a){
        if (a.length < 3) return 0;
        int sum = 0, p,i,k;
        for( i = 2;; i++){
            sum = i * (i + 1) / 2;
            if (sum == a.length) break;
            if (sum > a.length) return 0;
        }
        p = i;    
        for(i = 1, k = 1; i < p; i++){
            sum = 0;
            for (int j = 0; j < i + 1; j++) {
                sum += a[k++];
            }
            if (sum != a[0]) return 0;
        }
        return 1;
            
    }
    public static void main(String[] args) {

        //is madhav array
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
        System.out.println(isMadhavArray(array));
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[] {2, 1, 1, 4, -1, -1}));

        //not madhav array
        System.out.println(isMadhavArray(new int[] {18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[] {3, 1, 2, 3, 0}));

    }

    
}
