package Test_2;

/* 
 * Date: Jul 26, 2023
 * Created by davisbug
 * 
 */

public class InertialArray {
    public static int isInertial(int[] a){
        int isInertial = 1;
        int hasAtleastOneOdd = 0;
        int maxNumberIsEven = 0;
        int maxNumber = a[0];
        int lengthOdd = 0;
        int lengthEven = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1 || a[i] % 2 == -1) {
                hasAtleastOneOdd = 1;
                lengthOdd++;
            } else lengthEven++;
        }
        if (hasAtleastOneOdd == 0) return 0;

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    if (a[i] > maxNumber) maxNumber = a[i];
                }
            }
        }
        if (maxNumber % 2 == 0 || maxNumber % 2 == -0) {
            maxNumberIsEven = 1;
        }
        if (maxNumberIsEven == 0) return 0;

        int[] oddValues = new int[lengthOdd];
        int[] evenValues = new int[lengthEven];
        int oddIdx = 0;
        int evenIdx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 || a[i] % 2 == -0) {
                evenValues[evenIdx] = a[i];
                evenIdx++;
            } else {
                oddValues[oddIdx] = a[i];
                oddIdx++;
            }
        }

        for (int i = 0; i < oddValues.length; i++) {
            for (int j = 0; j < evenValues.length; j++) {
                if (evenValues[j] != maxNumber) {
                    if (oddValues[i] < evenValues[j]) {
                        isInertial = 0;
                        return isInertial;
                    }
                }
            }
        }
        return isInertial ;
    }

    public static void main(String[] args) {
        System.out.println(isInertial(new int[] {1}));
        System.out.println(isInertial(new int[] {2} ));
        System.out.println(isInertial(new int[] {1, 1, 1, 1, 1, 1, 2}));
        System.out.println(isInertial(new int[] {2, 12, 4, 6, 8, 11}));
        
    }

    
}
