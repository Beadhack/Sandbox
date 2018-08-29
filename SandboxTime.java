/*
 Program to get minutes and remaining seconds from an amount of time
in seconds. For example, 500 seconds has 8 minutes and 20 seconds.
 */
import java.util.Scanner;

/**
 *
 * @author prtaylor
 */
public class SandboxTime {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter time in seconds:");
        int time = input.nextInt();
        int minutes = time/60;
        int seconds = time%60;
        System.out.println("elapsed time is "+minutes+" minutes and "+seconds+" seconds");
    }
    
}
