package springmvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import springmvc.entities.User;


public class UserDao {
	
	
	private JdbcTemplate jdbcTemplate;
	
	public int insert(User user) {
		//insert query
		System.out.println("Inside user jdbc function!");
		String query = "insert into user(name,email,password) values(?,?,?)";
        //fire Query
        int result = this.jdbcTemplate.update(query, user.getUserName(), 
        		user.getUserEmail(), user.getUserPassword());
        
        return result;		
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	


}
