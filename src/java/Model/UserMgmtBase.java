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
public interface UserMgmtBase {
    public  UserMgmtBase getUserMgmt();
    public int registerUser( String email, String pass);
    public void deregisterUser( String email );
    public List<BasicUser> getUserList();
 
}
