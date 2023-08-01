package Test_11;
/* 
 * Date: Aug 1, 2023
 * Created by davisbug
 * 
 */
public class SequentiallyBounded {
    public static int isSequentiallyBounded(int[ ] a){
        if (a.length == 0) return 1;
        if (a.length == 1 && a[0] == 0) return 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                return 0;
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j])
                    count++;
            }
            if (count >= a[i])
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        //Test Cases
        int[] array = {2, 3, 3, 99, 99, 99, 99, 99};
        System.out.println(isSequentiallyBounded(array));
        System.out.println(isSequentiallyBounded(new int[] {5, 5, 5, 2, 5}));
        System.out.println(isSequentiallyBounded(new int[] {5, 5, 5, 5}));
        System.out.println(isSequentiallyBounded(new int[] {}));
    }    
}
