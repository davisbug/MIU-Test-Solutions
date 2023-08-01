package Test_11;
/* 
 * Date: Aug 1, 2023
 * Created by davisbug
 * 
 */
public class MinMaxDisjoint {
    public static int isMinMaxDisjoint(int[ ] a){
        int minCount = 0, maxCount = 0;
        if (a.length <= 2) return 0;
        int min = a[0], max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > min) {
                max = a[i]; // Update maximum value
            }
            if (a[i] < max) {
                min = a[i]; // Update minimum value
            }

        }
        if(min == max) return 0;
        for (int j = 0; j < a.length - 1; j++) {
            if ((a[j] == min && a[j + 1] == max) || (a[j] == max && a[j + 1] == min)) {
                return 0;
            }
            if (a[j] == max) {
                maxCount++;
            }
            if (a[j] == min) {
                minCount++;
            }             
        }
        if (minCount > 1 || maxCount  > 1) return 0;

        
    
        return 1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] array = {1,1,2};
        System.out.println(isMinMaxDisjoint(array));
        System.out.println(isMinMaxDisjoint(new int[] {5, 4, 1, 3, 2}));
    }

}
