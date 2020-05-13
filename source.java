/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean checkPrime(int n){
        int count = 0;
        if ( n == 2 ) {
            return true;
        }
        for (int i = 2 ; i < n; i++){
            if (n % i == 0) {
                count ++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkPalin(String s){
        String s1 = "";
        for (int i = s.length() - 1; i >=0; i--){
            s1 = s1 + s.charAt(i);
        }
        for (int i = 0; i < s.length() ; i++){
            if (s.charAt(i) != s1.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void draw(){
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0; j < i ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static boolean checkArmstrong(int n){
        String digits = new Integer(n).toString();
        int sum = 0;
        for (int i = 0 ; i < digits.length(); i++){
            int digit = digits.charAt(i) - '0';
            sum += digit*digit*digit;
        }
        if (sum == n)
            return true;
        else return false;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
	    draw();
	    System.out.println("Prime check 6 : " + checkPrime(6));
	    System.out.println("Prime check 2 : " + checkPrime(2));
	    System.out.println("Prime check 17 : " + checkPrime(2));

	    System.out.println("Palindrome check 13: " + checkPalin("13"));
	    System.out.println("Palindrome check 121: " + checkPalin("121"));
	    System.out.println("Palindrome check 12321: " + checkPalin("12321"));

	    System.out.println("Armstrong check 153: " + checkArmstrong(153));
	    System.out.println("Armstrong check 19: " + checkArmstrong(19));

	}
}


/*

*
**
***
****
Prime check 6 : false
Prime check 2 : true
Prime check 17 : true
Palindrome check 13: false
Palindrome check 121: true
Palindrome check 12321: true
Armstrong check 153: true
Armstrong check 19: false

*/
