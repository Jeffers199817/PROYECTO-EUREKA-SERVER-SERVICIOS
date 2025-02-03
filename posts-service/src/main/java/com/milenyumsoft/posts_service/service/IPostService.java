package com.milenyumsoft.posts_service.service;

import com.milenyumsoft.posts_service.model.Post;

import java.util.List;

public interface IPostService {

    public List<Post> getPostsByUser(Long user_id);

    public String saludoBienvenido(String hola);
}
