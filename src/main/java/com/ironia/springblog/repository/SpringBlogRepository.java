package com.ironia.springblog.repository;

import com.ironia.springblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringBlogRepository extends JpaRepository<Post, Long> {

}
