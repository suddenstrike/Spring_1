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
public class UserMgmtDAOFactory {
    public UserMgmtDAOIface getUserMgmtDAO( int type ) {
        
        UserMgmtDAOIface userMgmt = null;
        switch( type ) {
            case 1:
                userMgmt = (UserMgmtDAOIface) new UserMgmtInMemoryDAO();
            break;
            case 2:
                userMgmt = (UserMgmtDAOIface) new UserMgmtSimpleJDBCDAO();
            break;
        }
        return userMgmt.getUserMgmtDAO();
      }
    
}
