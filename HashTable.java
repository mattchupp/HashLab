/**      
 * @author      Matt Chupp
 * @id          mlchupp 
 * @course      Prog II 
 * @assignment  Lab6 -- Hash Lab 
 * @related     -
 * @included    -
 */

public class HashTable {

    // create a new item table
    Item[] table; 
    int size;  // size of the table
    int compares;  // number of compares that happen
    
    /**
     * Constructor for HashTable 
     * sets the size of the table
     * @param tableSize
     */
    public HashTable(int tableSize) {
        size = tableSize; 
        table = new Item[size]; 
    }
    
    /**
     * Add an object to the HashTable 
     * @param object
     */
    public void add(Comparable object) {
        int hash = object.hashCode();  
        Item item = new Item((Object)object);
        
        if (table[hash] == null) {
            table[hash] = item; 
        } else {
            item.setLink(table[hash]);
            table[hash] = item; 
        }
    }
    
    /**
     * finds the object in the HashTable 
     * @param object
     * @return object if the object exists if not returns null
     */
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
    
    /**
     * Get the number of compares
     * @return compares
     */
    public int getCompares() {
        return compares; 
    }
    
    /**
     * reset the number of compares
     */
    public void resetCompares() {
        compares = 0; 
    }
    
}
