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
     * 
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
     * 
     * @param iSsn
     */
    public Person(int iSsn) {
        this(iSsn, null, null); 
    }
    
    /**
     * @return 
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
     * 
     * @return
     */
    public int getSSN() {
        return ssn; 
    }
    
    /**
     * 
     * @return
     */
    public String getName() {
        return name; 
    }
    
    /**
     * 
     * @return
     */
    public String getEmail() {
        return email; 
    }
    
    
}
