package Test_4;
/* 
 * Date: Jul 27, 2023
 * Created by davisbug
 * 
 */
public class GuthrieIndex {
    public static int guthrieIndex(int n){
        int guthrieIndex = 0;
        if(n <= 0) return guthrieIndex;
        
        while(n!=1){
            //Even n
            if (n % 2 == 0){ 
                n = n / 2;
                guthrieIndex++;
            }
             //odd n
            else {
                n = ((n * 3) + 1);
                guthrieIndex++;
            }
        }
        return guthrieIndex;
    }
    public static void main(String[] args) {
        //Test cases
        System.out.println(guthrieIndex(0));
        System.out.println(guthrieIndex(1));
        System.out.println(guthrieIndex(2));
        System.out.println(guthrieIndex(3));
        System.out.println(guthrieIndex(7));
        System.out.println(guthrieIndex(42));
    }


    
}
