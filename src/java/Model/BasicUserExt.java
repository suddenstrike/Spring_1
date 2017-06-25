package Model;

import java.util.List;
import java.util.function.Consumer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEV
 */
public class BasicUserExt  extends BasicUser {
    public static String ConcatUserList( List<BasicUser> userList ) {
         String userString = new String();
        
        userList.forEach(new Consumer<BasicUser>() {
            @Override
            public void accept(BasicUser m) {
                userString = userString.concat(
                        ((BasicUser)m).getUserEmail()
                );
            }
        }) ;
                
                
        return userString;
     
        
    
        }
    
}
