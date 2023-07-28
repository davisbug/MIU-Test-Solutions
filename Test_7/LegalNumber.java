package Test_7;
/* 
 * Date: Jul 28, 2023
 * Created by davisbug
 * 
 */
public class LegalNumber {
    public static int isLegalNumber(int[ ] a, int base){
        int isLegalNumber = 1;
        for (int i = 0; i < a.length && isLegalNumber == 1; i++){
            if (a[i] >= base) isLegalNumber = 0;
        }
        return isLegalNumber;
    }
    public static void main(String[] args) {    
        int[] array = {3,2,1};
        System.out.println(isLegalNumber(array,4));
        System.out.println(isLegalNumber(new int[] {3, 7, 1}, 6));
        
        

        
    }

    
}
