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
public class UserMgmtInMemoryDAO implements UserMgmtDAOIface{
    
    private static final UserMgmtInMemoryDAO instance = new UserMgmtInMemoryDAO();
            
        
    protected UserMgmtInMemoryDAO(){
        }
    
    @Override
    public UserMgmtInMemoryDAO getUserMgmtDAO() {
        return getInstance();
    }
    protected static UserMgmtInMemoryDAO getInstance() {
            return instance;
        }
    @Override
    public int registerUser( BasicUser user ) {
        
            
            userMap.put( user.getUserEmail(), user.getUserPass() );
            
            return 0;
        }
        
    @Override
    public void deregisterUser( String email ) {
            
            userMap.remove(email);
    }
    
    @Override
    public List<BasicUser> getUserList() {
        List<BasicUser> userList = new ArrayList<>();
        
        userMap.entrySet().forEach((m) -> {
            userList.add( (BasicUser)m.getValue());
        });
        
        return userList;
    }
    
    private static final Map<String, Object> userMap = new HashMap<String, Object>();

}
