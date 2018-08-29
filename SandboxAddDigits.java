package helloworld;

/*
Reads an integer between 0 and 9999 and adds all the digits in the integer.
For example if an integer is 932 the sum of its digits is 14.
*/

import java.util.Scanner;

public class SandboxAddDigits {
    
    public static void main(String[] args) {
        int thous, hundr, tens, ones, h, t, out, sum;
        
        System.out.println("Enter radius and length of cylinder to calculate volumn");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        thous = n/1000;     //value of thousands digit
        h=n%1000;           //value of original number minus the thousands part
        hundr = h/100;      //value of hundreds digit
        t=h%100;            //value of original number minus thous and hundreds
        tens = t/10;        //value of tens digit
        ones = t%10;        //value of ones digit
        
        sum = thous + hundr + tens + ones;
        
        System.out.println("sum of digits is: " + sum);
        scan.close();
       
    }
}    
   