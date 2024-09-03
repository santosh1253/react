package com.myrestful.webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myrestful.webservices.mypack.Post;

public interface PostRepository extends JpaRepository<Post,Integer>{

}
