package Test_7;
/* 
 * Date: Jul 28, 2023
 * Created by davisbug
 * 
 */
public class ConvertToBase10 {
    public static int caculateLegalNumber(int n,int legal) {
		if(legal == 0)
			return 1;

		int legalNumber = 1;
		for (int i = 0; i < legal; i++) {
			legalNumber = legalNumber * n;
		}
		return legalNumber;
	}
	
	public static int isLegalNumber(int[] a, int base) {
		if(a.length == 0 || a == null || base == 0)
			return 0;
		
		for(int anA : a) {
			if(anA < 0 || anA > base)
				return 0;
		}
		
		return 1;
	}
    public static int convertToBase10(int[ ] a, int base) {
		if(isLegalNumber(a, base) == 0) {
			return 0;
		}
		int base10 = 0;
		for (int i = a.length; i > 0; i--) {
			base10 += a[i-1] * caculateLegalNumber(base, a.length - i);
		}
		return base10;
	}
    public static void main(String[] args) {
        //Test Cases
        System.out.println(convertToBase10(new int[] {1, 0, 1, 1}, 2));
        System.out.println(convertToBase10(new int[ ] {1, 1, 2}, 3));
        System.out.println(convertToBase10(new int[] {3, 2, 5}, 8)); 
        System.out.println(convertToBase10 (new int[] {3, 7, 1}, 6));
    }
}
