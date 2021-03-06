package springmvc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import springmvc.dao.UserDao;

@Configuration
//@ComponentScan("springmvc.dao")
public class SpringConfig {
	
	@Bean("dataSource")
	public DataSource getDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("Password*******");
		System.out.println("Inside DriverManager DataSouce mthod declaration");
		return dataSource;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		System.out.println("Inside getJDBC method!");
		return jdbcTemplate;
	}
	
	@Bean("getUserDao")	
	public UserDao getUserDao() {
	  
		UserDao userDao = new UserDao(); 
		userDao.setJdbcTemplate(getJdbcTemplate()); 
		return userDao;
		  
	  }
	 
	

}
