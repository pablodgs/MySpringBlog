package com.example.myspringblog.application.service;

import com.example.myspringblog.domain.model.CommonBlog;
import com.example.myspringblog.infrastructure.persistence.BlogInputDataStream;

public interface BlogInputBoundary {
	CommonBlog saveBlog(BlogInputDataStream blogInDS);

}
