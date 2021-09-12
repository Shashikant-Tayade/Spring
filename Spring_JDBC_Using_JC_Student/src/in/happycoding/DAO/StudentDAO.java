package in.happycoding.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component (value = "studentDAO")  // here value is for id
@Scope (value = "prototype")
public class StudentDAO 
{
@Autowired
	
	private JdbcTemplate jdbcTemplate;

public String getNameById(int roll_number)
{
	
	String Query = "SELECT name FROM stud WHERE roll_number = " +roll_number;
	
	String firstName = jdbcTemplate.queryForObject(Query, String.class);
	
	return firstName;
	
}


}
