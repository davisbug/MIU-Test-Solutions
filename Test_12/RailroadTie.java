package Test_12;
/* 
 * Date: Aug 1, 2023
 * Created by davisbug
 * 
 */
public class RailroadTie {
    public static int isRailroadTie(int[ ] a){
        if (a.length <= 1 || a[0] == 0 || a[(a.length - 1)] == 0){
             return 0;
        }
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != 0 && ((a[i + 1] != 0 && a[i - 1] != 0) || (a[i + 1] == 0 && a[i - 1] == 0))) {
                return 0;
            } else if (a[i] == 0 && (a[i - 1] == 0 || a[i + 1] == 0)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        //Test Cases
        int[] array = {3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3};
        System.out.println(isRailroadTie(array));
        System.out.println(isRailroadTie(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

}
