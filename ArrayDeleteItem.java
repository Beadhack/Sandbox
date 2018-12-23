/*Patricia Renee Taylor 12/22/2018  
* Program accepts array, item location to be deleted. Rearranges
* so the items don't have a gap or null.
*/
package helloworld;

import java.util.Arrays;

/**
 *
 * @author prtaylor
 */
public class ArrayDeleteItem {
    public static void main(String args[]){
        
        int arr[] = {2,7,3,9,4,6};
        int j=3; //position to delete item
        
        System.out.println("array before method: "+Arrays.toString(arr)+"\n");
        
        System.out.println("delete element at location _"+j+"_"+"\n");
        
        int arrBack[] = DeleteItem(arr, j);
        
        System.out.println("array after method:  "+Arrays.toString(arrBack)+"\n");
    }
    
    public static int [] DeleteItem(int[] array, int j) {
    // move elements over, erasing jth element    
        for (int k=j-1; k<array.length-1; k++) {
            array[k]=array[k+1];
        }
    // create new array with one less element    
        int[] arrayReturn = new int[array.length-1];
    // copy old array to one with correct length    
        System.arraycopy(array, 0, arrayReturn, 0, array.length-1);
       
        return arrayReturn;
    }    
                
    
    
}
