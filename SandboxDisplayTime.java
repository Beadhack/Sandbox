/*
 * Display the current time in GMT in the format hour:minute:second i.e. 13:19:8
 * currentTimeMillis method in System class returns the current time in
 * milleseconds elapsed since midnight Jan 1 1970 GMT, or UNIX epoch. Apparently
 * there was no time before UNIX os was introduced.
 */
package helloworld;

/**
 *
 * @author prtaylor
 */
public class SandboxDisplayTime {
    
    public static void main(String[] args) {
        long currentMillSec = System.currentTimeMillis();
            System.out.println("currentMillSec: "+currentMillSec);
            
        long totalSec = currentMillSec / 1000;
            System.out.println("totalSec:       "+totalSec);
        int currentSec =  (int) (totalSec % 60);
            System.out.println("currentSec:     "+currentSec);
        
        int totalMin = (int) (totalSec / 60);
            System.out.println("totalMin:       "+totalMin);
        int currentMin = totalMin % 60;
            System.out.println("currentMin:     "+currentMin);
            
        int totalHrs = totalMin / 60;
            System.out.println("totalHrs:       "+totalHrs);
        int currentHrs = totalHrs % 24;
            System.out.println("currentHrs:     "+currentHrs);    
            
        System.out.println("min:sec             "+currentHrs+":"+currentMin+":"+currentSec);
    }
    
}
