package com.milenyumsoft.posts_service.service;

import com.milenyumsoft.posts_service.model.Post;
import com.milenyumsoft.posts_service.repository.IPostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService{

   @Autowired
   private IPostRepository postRepository;


    @Override
    public List<Post> getPostsByUser(Long user_id) {
        return postRepository.findPostByUserId(user_id);
    }

    @Override
    public String saludoBienvenido(String hola) {

        if(hola.equals("hola")) {
            String hola1 = "Tenemos que hablar";
            


            return hola1;
        }


        return "false";
    }
}
