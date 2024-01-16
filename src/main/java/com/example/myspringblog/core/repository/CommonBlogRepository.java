package com.example.myspringblog.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspringblog.core.entity.CommonBlog;

public interface CommonBlogRepository extends JpaRepository<CommonBlog, String> {

}
