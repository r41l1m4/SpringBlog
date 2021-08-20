package com.ironia.springblog.utils;

import com.ironia.springblog.model.Post;
import com.ironia.springblog.repository.SpringBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    SpringBlogRepository springBlogRepository;

    //uncomment the line below if you wanna populate the DB.
    //@PostConstruct
    public void savePosts() {
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Raí L.");
        post1.setData(LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("\n" +
                "\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque efficitur lacinia varius. Maecenas ut commodo nisl, in lacinia tellus. Donec pulvinar, lacus et rutrum egestas, purus nunc viverra ex, eu vestibulum odio elit in mi. Aliquam et metus ac lorem sollicitudin ultrices. Nunc lobortis facilisis ligula, id luctus leo feugiat ornare. Nulla ac ultrices sem. Integer eget metus et eros aliquam imperdiet vel vitae est.\n" +
                "\n" +
                "Suspendisse accumsan odio vel sapien lacinia imperdiet. Nunc sit amet tempor turpis, a ultricies ligula. Suspendisse elit nunc, ornare quis eros tempus, porta molestie quam. Quisque tristique tellus eget metus faucibus aliquet non et elit. Fusce at nunc congue, semper dui id, luctus neque. Duis egestas rhoncus ipsum, sit amet pretium lorem convallis ac. Suspendisse elementum elit non aliquam semper. Nulla facilisi. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget eros libero. Cras sagittis mi ligula, et cursus risus ornare a. Quisque faucibus convallis enim, a consequat dui viverra et. Proin sodales, ante et pretium bibendum, leo elit rutrum dui, eu placerat ex turpis vel augue.\n" +
                "\n" +
                "Aliquam quis placerat diam. Phasellus cursus gravida est sed imperdiet. Aliquam ornare justo ut dui dignissim venenatis. Aliquam malesuada nec augue in dictum. Phasellus quis metus iaculis, vehicula diam et, pellentesque lorem. Nam nec lobortis purus. Integer ultricies pharetra nibh id elementum. In hac habitasse platea dictumst. Integer aliquam tempor turpis quis ornare. Mauris posuere non nisl id aliquet. Integer id porttitor sem. Nunc orci magna, blandit dignissim tellus sed, malesuada convallis diam. Duis ac libero vulputate, consectetur est vel, semper dolor. Donec a rhoncus nibh, id bibendum ex. Morbi sodales imperdiet magna, quis finibus sapien commodo sed.\n" +
                "\n" +
                "Etiam sit amet erat et risus suscipit feugiat eget sed lectus. Aenean at augue sed velit ornare semper. Nunc in massa ullamcorper, scelerisque elit at, elementum tellus. Fusce consequat venenatis pulvinar. Mauris sit amet molestie sapien. Nulla facilisi. Integer id porttitor leo. Morbi sed sem ut ex blandit faucibus. Duis lobortis orci massa, efficitur tincidunt nisi consequat vitae. Sed porta lorem sit amet dui fermentum, sed interdum odio pretium.\n" +
                "\n" +
                "Aliquam ut massa quis lorem mattis tristique vel vel massa. Maecenas aliquet, leo non convallis fringilla, metus ante sodales dui, ac maximus nisi massa a nibh. Vestibulum quis accumsan nunc, sed consectetur felis. Quisque vehicula metus massa. Pellentesque finibus porttitor purus ac placerat. Vivamus venenatis maximus sem eget hendrerit. Proin pharetra sit amet ante sed eleifend. Integer quis convallis nibh. Mauris in molestie ipsum, eu efficitur ipsum. Vivamus ac pretium augue, sed pretium mauris. Aenean fermentum diam et est hendrerit, quis egestas ante ultrices. In hac habitasse platea dictumst. Curabitur mauris orci, auctor et blandit eu, sodales sed diam. In porttitor convallis mi, id suscipit arcu varius in. Vestibulum pulvinar auctor sodales. ");

        Post post2 = new Post();
        post2.setAutor("Raí L.");
        post2.setData(LocalDate.now());
        post2.setTitulo("API REST");
        post2.setTexto("\n" +
                "\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque efficitur lacinia varius. Maecenas ut commodo nisl, in lacinia tellus. Donec pulvinar, lacus et rutrum egestas, purus nunc viverra ex, eu vestibulum odio elit in mi. Aliquam et metus ac lorem sollicitudin ultrices. Nunc lobortis facilisis ligula, id luctus leo feugiat ornare. Nulla ac ultrices sem. Integer eget metus et eros aliquam imperdiet vel vitae est.\n" +
                "\n" +
                "Suspendisse accumsan odio vel sapien lacinia imperdiet. Nunc sit amet tempor turpis, a ultricies ligula. Suspendisse elit nunc, ornare quis eros tempus, porta molestie quam. Quisque tristique tellus eget metus faucibus aliquet non et elit. Fusce at nunc congue, semper dui id, luctus neque. Duis egestas rhoncus ipsum, sit amet pretium lorem convallis ac. Suspendisse elementum elit non aliquam semper. Nulla facilisi. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget eros libero. Cras sagittis mi ligula, et cursus risus ornare a. Quisque faucibus convallis enim, a consequat dui viverra et. Proin sodales, ante et pretium bibendum, leo elit rutrum dui, eu placerat ex turpis vel augue.\n" +
                "\n" +
                "Aliquam quis placerat diam. Phasellus cursus gravida est sed imperdiet. Aliquam ornare justo ut dui dignissim venenatis. Aliquam malesuada nec augue in dictum. Phasellus quis metus iaculis, vehicula diam et, pellentesque lorem. Nam nec lobortis purus. Integer ultricies pharetra nibh id elementum. In hac habitasse platea dictumst. Integer aliquam tempor turpis quis ornare. Mauris posuere non nisl id aliquet. Integer id porttitor sem. Nunc orci magna, blandit dignissim tellus sed, malesuada convallis diam. Duis ac libero vulputate, consectetur est vel, semper dolor. Donec a rhoncus nibh, id bibendum ex. Morbi sodales imperdiet magna, quis finibus sapien commodo sed.\n" +
                "\n" +
                "Etiam sit amet erat et risus suscipit feugiat eget sed lectus. Aenean at augue sed velit ornare semper. Nunc in massa ullamcorper, scelerisque elit at, elementum tellus. Fusce consequat venenatis pulvinar. Mauris sit amet molestie sapien. Nulla facilisi. Integer id porttitor leo. Morbi sed sem ut ex blandit faucibus. Duis lobortis orci massa, efficitur tincidunt nisi consequat vitae. Sed porta lorem sit amet dui fermentum, sed interdum odio pretium.\n" +
                "\n" +
                "Aliquam ut massa quis lorem mattis tristique vel vel massa. Maecenas aliquet, leo non convallis fringilla, metus ante sodales dui, ac maximus nisi massa a nibh. Vestibulum quis accumsan nunc, sed consectetur felis. Quisque vehicula metus massa. Pellentesque finibus porttitor purus ac placerat. Vivamus venenatis maximus sem eget hendrerit. Proin pharetra sit amet ante sed eleifend. Integer quis convallis nibh. Mauris in molestie ipsum, eu efficitur ipsum. Vivamus ac pretium augue, sed pretium mauris. Aenean fermentum diam et est hendrerit, quis egestas ante ultrices. In hac habitasse platea dictumst. Curabitur mauris orci, auctor et blandit eu, sodales sed diam. In porttitor convallis mi, id suscipit arcu varius in. Vestibulum pulvinar auctor sodales. ");


        postList.add(post1);
        postList.add(post2);

        for (Post post : postList){
            Post postSaved = springBlogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
