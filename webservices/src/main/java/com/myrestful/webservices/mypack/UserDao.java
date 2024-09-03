package com.myrestful.webservices.mypack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	private static List<User> users=new ArrayList<>();
	private static int id=0;
	static
	{
	users.add(new User(++id,"Guru",LocalDate.now().minusYears(20)));
	users.add(new User(++id,"Ramesh",LocalDate.now().minusYears(25)));
	users.add(new User(++id,"Pavan",LocalDate.now().minusYears(18)));
	}
	public List<User> findAll()
	{
		return users;
	}
	public User findById(int id)
	{
		User res=null;
		for(User u:users)
		{
			if(u.getId()==id)
			{
				return u;
			}
		}
		return res;
	}
	public User saveUser(User u)
	{
		u.setId(++id);
		users.add(u);
		return findById(id);
	}
	public void deleteById(int id)
	{
		User u=findById(id);
		users.remove(u);
	}
}
