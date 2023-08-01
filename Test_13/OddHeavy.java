package Test_13;
/* 
 * Date: Aug 1, 2023
 * Created by davisbug
 * 
 */
public class OddHeavy {
    public static int isOddHeavy(int[ ] a){
        boolean oddFlag = false;
        int smallestOdd = Integer.MAX_VALUE;
        int largestEven = Integer.MIN_VALUE;

        for(int anA : a) {
            if(anA % 2 != 0) {
                oddFlag = true;
                if(anA < smallestOdd){
                     smallestOdd = anA;
                }
            } 
            else{
                if(anA > largestEven){
                    largestEven = anA;
                }
                    
            }
        }

        if(oddFlag && smallestOdd > largestEven)
            return 1;
        else return 0;
    }

    public static void main(String[] args) {

        // Test Cases
        int[] array = {11, 4, 9, 2, 8};
        System.out.println(isOddHeavy(array));
        System.out.println(isOddHeavy(new int[] {1}));
        System.out.println(isOddHeavy(new int[] {2}));
        System.out.println(isOddHeavy(new int[] {-2, -4, -6, 0 -8, -11}));

    }

    
}
