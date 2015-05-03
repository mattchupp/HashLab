
/**      
 * @author      Matt Chupp
 * @id          mlchupp 
 * @course      Prog II 
 * @assignment  Lab6 -- Hash Lab 
 * @related     -
 * @included    -
 */

public class HashTable {

    Item[] table; 
    int size; 
    int compares; 
    
    
    public HashTable(int tableSize) {
        size = tableSize; 
        table = new Item[size]; 
    }
    
    public void add(Comparable object) {
        int hash = object.hashCode();  
        Item item = new Item((Object)object);
        
        if(table[hash] == null) {
            table[hash] = item; 
        } else {
            item.setLink(table[hash]);
            table[hash] = item; 
        }
    }
    
    public Comparable find(Comparable object) {
        int hash = object.hashCode(); 
        Item item = table[hash]; 
        
        while (item != null) {
            compares++; 
            Comparable data = (Comparable) item.getData(); 
            
            if (data.compareTo(object) == 0) {
                return (Comparable)object; 
            }           
        }
        
        return null; 
    }
    
    public int getCompares() {
        return compares; 
    }
    
    public void resetCompares() {
        compares = 0; 
    }
    
}
