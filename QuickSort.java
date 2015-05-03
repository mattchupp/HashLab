
public class QuickSort {

    private int swapCount; 
    private int compareCount;    
    private int count = 0; 
    private Object[] table; 
    
    
    public QuickSort(int size) {
        table = new Object[size]; 
    }
    
    public void add(Object o) {
        
        table[count] = o; 
        count++; 
    }
    
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
    
    public void sort(Comparable[] array) {
        
        // if empty array return
        if(array == null || array.length == 0) {
            return;
        }
        
        recursiveSort(array, 0, array.length - 1);        
    }
    
    public void swap(Comparable[] array, int x, int y) {
        
        Comparable temp = array[x];
        array[x] = array[y]; 
        array[y] = temp; 
        
        swapCount++; 
    }
    
    public int getSwapCount() {       
        return swapCount; 
    }
    
    public int getCompareCount() {
        return compareCount; 
    }
    
    public void resetSwapCount() {
        swapCount = 0; 
    }   
    
    public void resetCompareCount() {
        compareCount = 0; 
    }
    
}
