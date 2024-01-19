package com.example.myspringblog.infra;

import com.example.myspringblog.core.entity.CommonUser;

public record BlogInputDataStream (String title, String content, CommonUser writer) {}
