package Test_10;
/* 
 * Date: Jul 31, 2023
 * Created by davisbug
 * 
 */
public class Vanilla {
    public static int isVanilla(int[]a){      
        if (a.length == 0) return 1;
        int digit = a[0] % 10; 
        for (int anA : a) {
            anA = anA < 0 ? -anA : anA;
            while (anA > 0) {
                int d = anA % 10;
                anA /= 10;
                if (d != digit)
                    return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        //Test cases
        int[] array = {};
        System.out.println(isVanilla(array));
        System.out.println(isVanilla(new int[] {11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[] {1}));
        System.out.println(isVanilla(new int[] {9, 999, 99999, -9999}));
    }

    
}
