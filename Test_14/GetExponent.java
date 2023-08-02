package Test_14;
/* 
 * Date: Aug 2, 2023
 * Created by davisbug
 * 
 */
public class GetExponent{
    public static int getExponent(int n, int p){
        int xponent = 0;
       if(p <=1) return -1;

       // n = n < 0 ? -n : 0;
       if (n<0) n = -n;
       while (n > 0) {
           if(n % p == 0) xponent++;
           else break;
           n /= p;  
       }
       return xponent;
   }

   public static void main(String[] args) {
       //Test Cases
       System.out.println(getExponent(-250,5));
       System.out.println(getExponent(27, 3));
       System.out.println(getExponent(28, 3));
   }

}
