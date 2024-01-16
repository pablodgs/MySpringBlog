package com.example.myspringblog.core.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CommonBlog {
	
	private @Id String id;
	private String title;
	private String content;
	private @ManyToOne CommonUser writer;
	
	public CommonBlog() {
		super();
	}

	public CommonBlog(String title, String content, CommonUser writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	public CommonBlog(String id, String title, String content, CommonUser writer) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	public CommonUser getWriter() {
		return writer;
	}

	public void setWriter(CommonUser writer) {
		this.writer = writer;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.title, this.content, this.writer);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CommonBlog))
			return false;
		CommonBlog blog = (CommonBlog) obj;
		return Objects.equals(this.id, blog.id) && Objects.equals(this.title, blog.title) 
				&& Objects.equals(this.content, blog.content) && Objects.equals(this.writer, blog.writer);
	}
	
	@Override
	public String toString() {
		return "CommonBlog{" + "id='" + this.id + "\'" + ", title='" + this.title + "\'" 
				+ ", content='" + this.content + "\'" + ", writer=" + this.writer + "}";
	}

}
