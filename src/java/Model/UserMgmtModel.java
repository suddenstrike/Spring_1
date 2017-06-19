/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author DEV
 */
public class UserMgmtModel implements UserMgmtIface{
   
    private UserMgmtDAOFactory  userMgmtDAOFactory;
    
     public UserMgmtModel() {
        userMgmtDAOFactory = new UserMgmtDAOFactory();  
    }
    
    public int registerUser( String email, String pass) {
        
        return userMgmtDAOFactory.getUserMgmtDAO(2).registerUser(email, pass);
    }

    
   
    public void deregisterUser( String email ) {
       
        userMgmtDAOFactory.getUserMgmtDAO(1).deregisterUser(email);
    }

    public List<BasicUser> getUserList() {  
        
    
        return userMgmtDAOFactory.getUserMgmtDAO(1).getUserList();
    }

    
}
