package com.example.myspringblog.application.service;

import java.util.UUID;

import org.springframework.context.annotation.Configuration;

import com.example.myspringblog.domain.model.CommonBlog;
import com.example.myspringblog.domain.model.CommonUser;
import com.example.myspringblog.domain.repository.CommonBlogRepository;
import com.example.myspringblog.infrastructure.persistence.BlogInputDataStream;

@Configuration
public class BlogInteractor implements BlogInputBoundary {
	private final CommonBlogRepository blogAccessInterface;

	public BlogInteractor(CommonBlogRepository blogAccessInterface) {
		super();
		this.blogAccessInterface = blogAccessInterface;
	}

	@Override
	public CommonBlog saveBlog(BlogInputDataStream blogInDS) {
		CommonBlog blog = new CommonBlog();
		CommonUser writer = blogInDS.writer();
		blog.setTitle(blogInDS.title());
		blog.setContent(blogInDS.content());
		blog.setId(UUID.randomUUID());
		blog.setWriter(writer);
		return blogAccessInterface.save(blog);
	};

}
