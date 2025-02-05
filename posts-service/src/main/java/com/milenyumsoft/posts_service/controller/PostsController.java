package com.milenyumsoft.posts_service.controller;

import com.milenyumsoft.posts_service.model.Post;
import com.milenyumsoft.posts_service.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private IPostService postService;


    @Value("${server.port}")
    private int serverPort;


    @GetMapping("/{user_id}")
    public List<Post> getPostsByUserId(@PathVariable Long user_id) {
        System.out.println("================Estoy en el puerto " + serverPort);
        System.out.println("...........................");
        System.out.println("//////////////////");
    return postService.getPostsByUser(user_id);
    }


    @GetMapping("/bienvenido/{hola}")
    public String saludoBienvenido(@PathVariable String hola){

        String hola1 = hola + " Un placer atenderte.";
        return hola1;





    }

    @GetMapping("/posts")
    public List<Post> allListsPosts(){

        return postService.allListPosts();
    }

}
