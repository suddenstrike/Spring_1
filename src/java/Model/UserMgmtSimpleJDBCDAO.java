/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author DEV
 */
public class UserMgmtSimpleJDBCDAO implements UserMgmtDAOIface{ 
    
    private static final UserMgmtSimpleJDBCDAO instance = new UserMgmtSimpleJDBCDAO();
  
    private  static final DriverManagerDataSource dataSource;
    private  static  final JdbcTemplate jdbcTemplate;
    
    
    static{
        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test"); // ("jdbc:hsqldb:hsql://localhost:");
        dataSource.setUsername("root");
        dataSource.setPassword("Strucc%Tigris86");
        //@Autowired
        jdbcTemplate = new JdbcTemplate(dataSource);
        
    }
             
    

    public UserMgmtSimpleJDBCDAO() {
    }

  

    
    
    protected static UserMgmtSimpleJDBCDAO getInstance() {
            return instance;
    }
    
    @Override
       public  UserMgmtDAOIface getUserMgmtDAO() {
           return getInstance();
       }

    @Override
    public int registerUser( BasicUser user ) {
            int rowCount = this.jdbcTemplate.queryForObject("select count(*) from tbl_user", Integer.class);
            
            
                this.jdbcTemplate.update("insert into tbl_user (user_name, user_email, user_pass, IS_DELETED) values (?, ?, ?, 0)", user.getUserEmail(), user.getUserEmail(), user.getUserPass() );
            
            
        return 0;
    }
            

    @Override
    public void deregisterUser( String email ) {
        
    }

    @Override
    public List<BasicUser> getUserList() {
        List<BasicUser> userList = this.jdbcTemplate.query(
        "select user_email, user_pass from tbl_user",
        new RowMapper<BasicUser>() {
            public BasicUser mapRow(ResultSet rs, int rowNum) throws SQLException {
                BasicUser user = new BasicUser(rs.getString("user_email"),rs.getString("user_pass"));
                return user;
            }
        });
        return userList;
    }
}
    
 