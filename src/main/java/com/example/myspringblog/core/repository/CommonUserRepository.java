package com.example.myspringblog.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspringblog.core.entity.CommonUser;

public interface CommonUserRepository extends JpaRepository<CommonUser, Long> {
	CommonUser findById(long id);

}
