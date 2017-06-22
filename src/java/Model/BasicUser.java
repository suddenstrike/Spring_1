/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;


/**
 * * @author DEV
 */
public class BasicUser implements Serializable {
  
    
    private String UserEmail;    private String UserPass;
    
    public BasicUser(String email, String pass) {
        setUserEmail( email );
        setUserPass( pass );
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public String getUserPass() {
        return UserPass;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    public void setUserPass(String UserPass) {
        this.UserPass = UserPass;
    }
    
    
}
