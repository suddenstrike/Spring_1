/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DEV
 */
public class UserMgmtMemory implements UserMgmtBase{
    
    private static UserMgmtMemory instance = new UserMgmtMemory();
            
        
    protected UserMgmtMemory(){
        }
    
    public UserMgmtMemory getUserMgmt() {
        return getInstance();
    }
    protected static UserMgmtMemory getInstance() {
            return instance;
        }
    public int registerUser( String email, String pass) {
        
            BasicUser user = new BasicUser( email, pass );
            userMap.put( email, user );
            
            return 0;
        }
        
    public void deregisterUser( String email ) {
            
            userMap.remove(email);
    }
    
    public List<BasicUser> getUserList() {
        List<BasicUser> userList = new ArrayList<BasicUser>();
        
        for( Map.Entry m:userMap.entrySet())
            userList.add( (BasicUser)m.getValue());
        
        return userList;
    }
    
    private static Map<String, Object> userMap = new HashMap<String, Object>();

}
