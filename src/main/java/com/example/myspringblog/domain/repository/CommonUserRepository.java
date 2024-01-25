package com.example.myspringblog.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspringblog.domain.model.CommonUser;


public interface CommonUserRepository extends JpaRepository<CommonUser, Long> {
	CommonUser findById(long id);

}
