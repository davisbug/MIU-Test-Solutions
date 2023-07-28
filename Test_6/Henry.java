package Test_6;
/* 
 * Date: Jul 28, 2023
 * Created by davisbug
 * 
 */
public class Henry {
    public  static int henry (int i, int j){
        int sum;
        int count = 0;
		int temp = 2;
		int firstNum = 0;
		int secNum = 0;
		while (true) {
			sum = 0;
			//first calculate the sum of all factors except itself
			for (int k = 1; k < temp; k++) {
				if (temp % k == 0)
					sum += k;
			}
			//if this true perfect number is found
			if (sum == temp) {
				//count is incremented to track the perfect number sequence
				count++;
				//ith perfect number is found
				if (count == i)
					firstNum = sum;
				//jth perfect number is found
				if(count==j)
					secNum=sum;
			}
			if(firstNum!=0 && secNum!=0)
				return firstNum+secNum;
			temp++;
		}
    }
    public static void main(String[] args) {
        //Test sample
        System.out.println(henry(1, 3));
    }

}
