package com.ironia.springblog.service;

import com.ironia.springblog.model.Post;

import java.util.List;

public interface SpringBlogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
