package spring.jdbc_module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class User {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void createTable()
	{
		jdbcTemplate.execute("create table if not exists user(id int primary key,name varchar(20)) ");
	}
	public void insertUser(int id, String name) {
		jdbcTemplate.update("insert into user(id,name) values(?,?)",id,name);
	}
	
	public String findUserNameById(int id)
	{
		
		return jdbcTemplate.queryForObject("SELECT name from user where id=?",String.class,id);
	}

}
