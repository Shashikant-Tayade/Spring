package in.happycoding.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import in.happycoding.bean.Person;

@Component

public class PersonDAO {

		
	@Autowired
	
	private JdbcTemplate jdbcTemplate;
	
	public String getNameById(int id)
	{
		
		String Query = "SELECT firstName FROM person WHERE id = " +id;
		
		String firstName = jdbcTemplate.queryForObject(Query, String.class);
		
		return firstName;
		
	}
	
	public int getIdByName(String firstName)
	{
		String query = "SELECT id FROM person WHERE firstName = '"+firstName+"'";
		
		int id = jdbcTemplate.queryForObject(query, Integer.class);
		
		return id;
	}
	
	public int getCount()
	{
		String query = "SELECT count(*) FROM person" ;
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}

	public void save(Person p)
	{
		String query = "insert into person values (?,?,?,?)";
		Object [] params = { p.getId(), p.getFirstName(), p.getLastName() , p.getLaptop_id() };
		jdbcTemplate.update(query, params);
	}
	
}
