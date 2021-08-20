package com.ironia.springblog.service.serviceImpl;

import com.ironia.springblog.model.Post;
import com.ironia.springblog.repository.SpringBlogRepository;
import com.ironia.springblog.service.SpringBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringBlogServiceImpl implements SpringBlogService {

    @Autowired
    SpringBlogRepository springBlogRepository;

    @Override
    public List<Post> findAll() {
        return springBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return springBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return springBlogRepository.save(post);
    }
}
