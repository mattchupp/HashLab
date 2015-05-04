/**      
 * @author      Matt Chupp
 * @id          mlchupp 
 * @course      Prog II 
 * @assignment  Lab6 -- Hash Lab 
 * @related     -
 * @included    -
 */


public class Item {

    Object item; 
    Item link; 
    
    public Item(Object i) {
        item = i; 
    }
    
    public Object getData() {
        return item; 
    }
    
    public Item getLink() {
        return link;  
    }
    
    public void setLink(Item i) {
        link = i; 
    }
    
}
