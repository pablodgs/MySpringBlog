package com.example.myspringblog.presentation.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myspringblog.application.service.BlogInputBoundary;
import com.example.myspringblog.domain.model.CommonBlog;
import com.example.myspringblog.domain.model.CommonUser;
import com.example.myspringblog.domain.repository.CommonBlogRepository;
import com.example.myspringblog.domain.repository.CommonUserRepository;
import com.example.myspringblog.infrastructure.persistence.BlogInputDataStream;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class UserController {
	private final CommonUserRepository userRepository;
	private final CommonBlogRepository blogRepository;
	private final BlogInputBoundary blogInputBoundary;
	
	public UserController(CommonUserRepository userRepo, CommonBlogRepository blogRepo, BlogInputBoundary blogInBound) {
		super();
		this.userRepository = userRepo;
		this.blogRepository = blogRepo;
		this.blogInputBoundary = blogInBound;
	}
	
	@GetMapping("/users")
	List<CommonUser> allUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/blogs")
	List<CommonBlog> allBlogs() {
		return blogRepository.findAll();
	}
	
	@PostMapping("/blog")
	ResponseEntity<CommonBlog> writeBlog(@RequestBody BlogInputDataStream blogInputDataStream) {
		CommonBlog newBlog = blogInputBoundary.saveBlog(blogInputDataStream);
		return ResponseEntity.ok().body(newBlog);
	}

}
