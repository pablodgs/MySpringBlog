package com.example.myspringblog.infra;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myspringblog.core.entity.CommonBlog;
import com.example.myspringblog.core.entity.CommonUser;
import com.example.myspringblog.core.repository.CommonBlogRepository;
import com.example.myspringblog.core.repository.CommonUserRepository;
import com.example.myspringblog.core.usecase.BlogInputBoundary;

@RestController
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
	ResponseEntity<String> writeBlog(@RequestBody BlogInputDataStream blogInputDataStream) {
		blogInputBoundary.saveBlog(blogInputDataStream);
//		URI location = new URI("http:/localhost:8080/home");
		HttpHeaders responseHeaders = new HttpHeaders();
//		responseHeaders.setLocation(location);
		responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<String>("Hello World", null, HttpStatus.CREATED);
	}

}
