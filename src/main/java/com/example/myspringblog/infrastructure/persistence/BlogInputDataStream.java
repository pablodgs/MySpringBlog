package com.example.myspringblog.infrastructure.persistence;

import com.example.myspringblog.domain.model.CommonUser;

public record BlogInputDataStream (String title, String content, CommonUser writer) {}
