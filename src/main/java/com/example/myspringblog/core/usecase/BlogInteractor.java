package com.example.myspringblog.core.usecase;

import java.util.UUID;

import org.springframework.context.annotation.Configuration;

import com.example.myspringblog.core.entity.CommonBlog;
import com.example.myspringblog.core.entity.CommonUser;
import com.example.myspringblog.core.repository.CommonBlogRepository;
import com.example.myspringblog.infra.BlogInputDataStream;

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
