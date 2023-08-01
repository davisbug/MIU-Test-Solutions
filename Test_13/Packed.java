package Test_13;
/* 
 * Date: Aug 1, 2023
 * Created by davisbug
 * 
 */
public class Packed {
    public static int isPacked(int[] a){
        int j = 0;
        for(int i = 0; i < a.length; i = j) {
            int count = 0;
            if(a[i] <= 0) return 0;
            for(j = i; j < i + a[i]; j++) {
                if(a[i] != a[j]) return 0;
            }
            for(int anA : a) {
                if(anA == a[i])
                    count++;
            }
            if(count > a[i]) return 0;
        }

        return 1;

    }
    public static void main(String[] args) {
        //Test cases
        int[] array = {2, 2, 1};
        System.out.println(isPacked(array));
        System.out.println(isPacked(new int[] {2, 2, 1, 2, 2}));
    }

}
