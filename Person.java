/**      
 * @author      Matt Chupp
 * @id          mlchupp 
 * @course      Prog II 
 * @assignment  Lab6 -- Hash Lab 
 * @related     -
 * @included    -
 */

public class Person {

    private int ssn; 
    private String name; 
    private String email; 
    
    /**
     * Initialize a person 
     * @param iSsn
     * @param iEmail
     * @param iName
     */
    public Person(int iSsn, String iEmail, String iName) {
        
        ssn = iSsn; 
        email = iEmail; 
        name = iName;      
    }
    
    /**
     * Person
     * @param iSsn
     */
    public Person(int iSsn) {
        this(iSsn, null, null); 
    }
    
    /**
     * hashes the ssn to get ints at 0, 4, 5, and 8
     * @return hashed ssn 
     */
    @Override 
    public int hashCode() {
        
        String stringSsn = ""+ssn;       
        return Integer.parseInt(""+stringSsn.charAt(0)+
                                   stringSsn.charAt(4)+
                                   stringSsn.charAt(5)+
                                   stringSsn.charAt(8));   
    }
    
    /**
     * get the ssn 
     * @return ssn 
     */
    public int getSSN() {
        return ssn; 
    }
    
    /**
     * get the name
     * @return name
     */
    public String getName() {
        return name; 
    }
    
    /**
     * get email of person
     * @return email 
     */
    public String getEmail() {
        return email; 
    }
    
    
}
