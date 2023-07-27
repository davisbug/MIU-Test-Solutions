package Test_4;
/* 
 * Date: Jul 27, 2023
 * Created by davisbug
 * 
 */
public class SumFactor {
    public static int sumFactor(int[] a){
        int sumFactor = 0;
        int sumElements = 0;

        for(int i = 0; i < a.length; i++){
            sumElements += a[i];
        }

        for(int j = 0; j< a.length; j++){
            if(sumElements == a[j]){
                sumFactor++;
            }
        }
        return sumFactor;
    }

    public static void main(String[] args) {
        //test cases
        int[] array = {0, 0, 0};
        System.out.println(sumFactor(array));
        System.out.println(sumFactor(new int[] {3, 0, 2, -5, 0}));
        System.out.println(sumFactor(new int[] {9, -3, -3, -1, -1}));
        System.out.println(sumFactor(new int[] {1}));

    }
}
