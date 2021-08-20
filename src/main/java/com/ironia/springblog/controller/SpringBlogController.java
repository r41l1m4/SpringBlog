package com.ironia.springblog.controller;

import com.ironia.springblog.model.Post;
import com.ironia.springblog.service.SpringBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SpringBlogController {

    @Autowired
    SpringBlogService springBlogService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = springBlogService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

}
