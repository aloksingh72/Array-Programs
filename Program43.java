/*Dated-> 20/10/2024/Sunday
* Reverse Integer
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */

import java.util.Scanner;
public class Program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        // method calling
        int result = reverseInteger(n);
        System.out.println(result);
        sc.close();
    }
    public static int reverseInteger(int n ){
        int rev  =0;
      
        while(n != 0){
            int rem = n%10;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE /10){
                return 0;
            }
            rev = rev*10 +rem;
            n = n/10;
        }
       return rev;

    }
}
