/*Patricia Renee Taylor 12/21/2018 Happy Birthday, Renee!!!
* Program accepts array, item to be inserted and location to put it.
* Output is array with inserted item.
*/
import java.util.Arrays;
 
public class ArrayInsertInto {
    
    public static void main(String[] args){
        int arr[] = {2,6,3,8,1};
        int item=86;                  // j is where to put it;  item is what to insert
        int j=3; 
        
        System.out.println("\n"+"Original array:  "+Arrays.toString(arr)); 
        System.out.println("\n"+"Insert _"+item+"_ at position _"+j+"_");
   // calling method
        int arrayBack[] = InsertItem(arr, item, j);
        System.out.println("\n"+"Array returned:  "+Arrays.toString(arrayBack));
    }//end main
        
    
    public static int[] InsertItem(int [] arr, int item, int j) {
       
   // create new array with one more element
        int[] arrReturn  = new int[arr.length+1];
         
   // copy input array elements to new output array
        System.arraycopy(arr, 0, arrReturn, 0, arr.length);
        
   // move elements over and insert item into location j
        for (int k = arrReturn.length-1; k>j-2; k--){
            
            if ( j-1 == k ){
                arrReturn[k] = item;
            }
            else {
                arrReturn[k] = arrReturn[k-1];
            }
        }

        return arrReturn;
    
    }     
}
