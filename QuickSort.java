/**      
 * @author      Matt Chupp
 * @id          mlchupp 
 * @course      Prog II 
 * @assignment  Lab6 -- Hash Lab 
 * @related     -
 * @included    -
 */

// Stores a list and sorts the list 
public class QuickSort {

    private int swapCount;  // how many swaps
    private int compareCount;    // how many compares
    private int count = 0;  
    private Object[] table; 
    
    /**
     * Constructor for QuickSort class 
     * Creates a table of Ojects
     * @param size of table
     */
    public QuickSort(int size) {
        table = new Object[size]; 
    }
    
    /**
     * Add object to the table 
     * @param o
     */
    public void add(Object o) {
        
        table[count] = o; 
        count++; 
    }
    
    /**
     * Algorithm for sorting the list 
     * @param array
     * @param low
     * @param high
     */
    public void recursiveSort(Comparable[] array, int low, int high) {
        
        if (low >= high) {
            return;
        }
        
        // finding middle 
        int middle = low + (high - low) / 2; 
   
        Comparable middleObject = array[middle];
        
        // puts middle at end of list
        swap(array, middle, high);  
        
        // store temp position
        int temp = low; 
        for (int i = low; i < high; i++) {
            
            compareCount++; 
            
            if (array[i].compareTo(middleObject) < 0) {
                swap(array, i, temp);
                temp++; 
            }  
        }
        
        swap(array, temp, high); 
        
        recursiveSort(array, low, temp - 1);
        recursiveSort(array, temp + 1, high);
       
    }
    
    /**
     * sort the list
     * @param array
     */
    public void sort(Comparable[] array) {
        
        // if empty array return
        if(array == null || array.length == 0) {
            return;
        }
        
        recursiveSort(array, 0, array.length - 1);        
    }
    
    /**
     * swap two objects in table 
     * @param array
     * @param x
     * @param y
     */
    public void swap(Comparable[] array, int x, int y) {
        
        Comparable temp = array[x];
        array[x] = array[y]; 
        array[y] = temp; 
        
        swapCount++; 
    }
    
    /**
     * 
     * @return number of swaps
     */
    public int getSwapCount() {       
        return swapCount; 
    }
    
    /**
     * 
     * @return number of compares
     */
    public int getCompareCount() {
        return compareCount; 
    }
    
    /**
     * resets the swap count
     */
    public void resetSwapCount() {
        swapCount = 0; 
    }   
    
    /**
     * resets the compare count
     */
    public void resetCompareCount() {
        compareCount = 0; 
    }
    
}
