package com.example.myspringblog;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myspringblog.core.entity.CommonBlog;
import com.example.myspringblog.core.entity.CommonUser;
import com.example.myspringblog.core.repository.CommonBlogRepository;
import com.example.myspringblog.core.repository.CommonUserRepository;

@RestController
public class UserController {
	private final CommonUserRepository userRepository;
	private final CommonBlogRepository blogRepository;
	
	public UserController(CommonUserRepository userRepository, CommonBlogRepository blogRepository) {
		super();
		this.userRepository = userRepository;
		this.blogRepository = blogRepository;
	}
	
	@GetMapping("/users")
	List<CommonUser> allUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/blogs")
	List<CommonBlog> allBlogs() {
		return blogRepository.findAll();
	}

}
