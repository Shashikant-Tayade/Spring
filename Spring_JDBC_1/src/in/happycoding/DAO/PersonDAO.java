package in.happycoding.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
			String query = "insert into person values(?,?,?,?)";
			Object[] params = {p.getId() ,p.getFirstName(), p.getLastName(), p.getLaptop_id()};
			jdbcTemplate.update(query, params);
		}
		
		public void update(String firstName, int id)
		{
			String query = "UPDATE person SET firstName = ? WHERE id = ? ";
			Object [] params = { firstName, id };
			jdbcTemplate.update(query, params);
		}
		
		
		public void deleteById(int id)
		{
			String query = "DELETE FROM person WHERE id = "+id;
			jdbcTemplate.update(query);
		}
		
		
		public Person getById(int id)
		{
			String query = "SELECT * FROM person WHERE id = "+id ;
			Person person = jdbcTemplate.queryForObject(query, new PersonMapper());
			return person; 
		}
		
		
		
		public List<Person> getAll()
		{
			
			String query = "SELECT * FROM person";
			return jdbcTemplate.query(query, new PersonMapper());
			
		}
		
		
		
		private class PersonMapper implements RowMapper<Person>
		{

			@Override
			public Person mapRow(ResultSet resultSet, int row) throws SQLException {
				
				
				Person person = new Person();
				person.setId(resultSet.getInt("id"));
				person.setFirstName(resultSet.getString("firstName"));
				person.setLastName(resultSet.getString("lastName"));
				person.setLaptop_id(resultSet.getString("laptop_id"));
				
				return person;
			
			}
			
		}
		
}
