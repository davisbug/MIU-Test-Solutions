package Test_10;
/* 
 * Date: Jul 31, 2023
 * Created by davisbug
 * 
 */
public class Trivalent {
    public static int isTrivalent (int[ ] a){
        int[] tempArray = new int[a.length];
        for (int i = 0; i < tempArray.length; i++)
            tempArray[i] = Integer.MIN_VALUE;

        int index = 0;
        for (int anA : a) {
            boolean flag = true;
            for (int k = 0; k < index; k++) {
                if (tempArray[k] == anA) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }

            if (flag) {
                tempArray[index] = anA;
                index++;
            }
        }

        if (index != 3) return 0;
        else return 1;
    }


    public static void main(String[] args) {
        //Test Cases
        int[] array = {1, 0, 2, 0, 4, 0};
        System.out.println(isTrivalent(array));
        System.out.println(isTrivalent(new int[] {-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[] { 2147483647, -1, -1, -2147483648}));
        System.out.println(isTrivalent(new int[] {}));
    }

}
