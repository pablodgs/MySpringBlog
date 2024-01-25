package com.example.myspringblog.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspringblog.domain.model.CommonBlog;

public interface CommonBlogRepository extends JpaRepository<CommonBlog, UUID> {
	

}
