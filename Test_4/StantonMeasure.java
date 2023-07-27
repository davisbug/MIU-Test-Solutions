package Test_4;
/* 
 * Date: Jul 27, 2023
 * Created by davisbug
 * 
 */
public class StantonMeasure {
    public static int stantonMeasure(int[] a){
        int n = 0;
        int stantonMeasure, stantonMeasureCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                n++;
            }
        }
        
        stantonMeasure = n;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == stantonMeasure) {
                stantonMeasureCount++;
            }   
        }
        return stantonMeasureCount;
    
    }

    public static void main(String[] args) {

        //Tes cases
        int[] array = {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4};
        System.out.println(stantonMeasure(array));
        System.out.println(stantonMeasure(new int[] {1}));
        System.out.println(stantonMeasure(new int[] {0}));
        System.out.println(stantonMeasure(new int[] {3, 1, 1, 4}));

    }

}
