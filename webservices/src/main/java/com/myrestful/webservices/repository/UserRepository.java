package com.myrestful.webservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myrestful.webservices.mypack.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
//	public User findUserById(int id);
//	public User save(User u);
//	public List<User> findAllUsers();
//	public void deleteUserById(int id);

}
