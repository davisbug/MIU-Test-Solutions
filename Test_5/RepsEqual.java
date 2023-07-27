package Test_5;
/* 
 * Date: Jul 27, 2023
 * Created by davisbug
 * 
 */
public class RepsEqual {
    public static int repsEqual(int[ ] a, int n) {
        String s = Integer.toString(n);
		String numArray = "";
		String str;
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			if (num > 0) {
				for (int k = i; k < a.length; k++) {
					str = Integer.toString(a[k]);
					numArray = numArray + str;
				}
				break;
			}
		}
		if (numArray.equals(s))
			return 1;
		else
			return 0;
    }
    public static void main(String[] args) {
        //Test cases
        System.out.println(repsEqual(new int[] {3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[] {3, 2, 0, 5}, 32053));
    }

    
}
