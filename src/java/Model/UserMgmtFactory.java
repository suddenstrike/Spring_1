/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DEV
 */
public class UserMgmtFactory {
    public UserMgmtBase getUserMgmt( int type ) {
        
        UserMgmtBase userMgmt = null;
        switch( type ) {
            case 1:
                userMgmt = (UserMgmtBase) new UserMgmtMemory();
            break;
        }
        return userMgmt.getUserMgmt();
      }
    
}
