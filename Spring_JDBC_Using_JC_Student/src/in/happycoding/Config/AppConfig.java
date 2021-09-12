package in.happycoding.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"in.happycoding.*"})

	public class AppConfig 
	{
	@Bean
	  public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    //MySQL database we are using
	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/happycodingdb1");//change url
	    dataSource.setUsername("root");//change userid
	    dataSource.setPassword("root");//change pwd
		return dataSource;

	}
	
	@Bean
	  public JdbcTemplate jdbcTemplate() {
	    JdbcTemplate jdbcTemplate = new JdbcTemplate();
	    jdbcTemplate.setDataSource(dataSource());
	    return jdbcTemplate;
	  }
	
	
}	
	
