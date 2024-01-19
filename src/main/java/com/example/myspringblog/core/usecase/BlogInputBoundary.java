package com.example.myspringblog.core.usecase;

import com.example.myspringblog.core.entity.CommonBlog;
import com.example.myspringblog.infra.BlogInputDataStream;

public interface BlogInputBoundary {
	CommonBlog saveBlog(BlogInputDataStream blogInDS);

}
