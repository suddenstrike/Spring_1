/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author DEV
 */
public class UserMgmtSimpleJDBCDAO implements UserMgmtDAOIface{ 
    
    private static final UserMgmtSimpleJDBCDAO instance = new UserMgmtSimpleJDBCDAO();
  
    private  DriverManagerDataSource dataSource;
    
    public UserMgmtSimpleJDBCDAO() {
        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test"); // ("jdbc:hsqldb:hsql://localhost:");
        dataSource.setUsername("root");
        dataSource.setPassword("Strucc%Tigris86");


    }
    
    protected static UserMgmtSimpleJDBCDAO getInstance() {
            return instance;
    }
    
    @Override
       public  UserMgmtDAOIface getUserMgmtDAO() {
           return getInstance();
       }

    @Override
    public int registerUser( String email, String pass) {
        return 0;
    }
            

    @Override
    public void deregisterUser( String email ) {
        
    }

    @Override
    public List<BasicUser> getUserList() {
        return null;
    }
}
    
 