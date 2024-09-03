package com.myrestful.webservices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myrestful.webservices.exceptions.UserNotFoundException;
import com.myrestful.webservices.mypack.Post;
import com.myrestful.webservices.mypack.User;
import com.myrestful.webservices.repository.PostRepository;
import com.myrestful.webservices.repository.UserRepository;

import jakarta.validation.Valid;

@RestController
public class UserJpaController {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private PostRepository post_repo;

	@GetMapping("/jpa/users")
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	@PostMapping("/jpa/users")
	public User saveuser(@RequestBody User user) {
		return repo.save(user);
	}

	@GetMapping("/jpa/users/{id}")
	public User getUserById(@PathVariable int id) {
		Optional<User> res = repo.findById(id);
		if (res.isEmpty())
			throw new UserNotFoundException(id);
		return res.get();
	}
    @DeleteMapping("/jpa/users/{id}")
    public void deleteById(@PathVariable int id)
    {
    	repo.deleteById(id);
    }
    @PutMapping("jpa/users/{id}")
    public User updateUserById(@PathVariable int id,@RequestBody User user)
    {
    	User fetchedUser=getUserById(id);
    	fetchedUser.setName(user.getName());
    	fetchedUser.setBirthDate(user.getBirthDate());
    	repo.save(fetchedUser);
		return fetchedUser;
    	
    }
    @GetMapping("/jpa/users/{id}/posts")
    public List<Post> getAllPostsByUserId(@PathVariable int id)
    {
    	User user=getUserById(id);
    	return user.getPosts();
    }
    
    @PostMapping("/jpa/users/{id}/posts")
    public Post createPostforUser(@PathVariable int id, @Valid @RequestBody Post post)
    {
    	User user=getUserById(id);
    	post.setUser(user);
    	post_repo.save(post);
		return post;
    	
    }
    
}
