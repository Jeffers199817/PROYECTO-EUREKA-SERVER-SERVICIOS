package com.milenyumsoft.users_service.controller;

import com.milenyumsoft.users_service.dto.UserDTO;
import com.milenyumsoft.users_service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {


    @Autowired
    private IUserService servUsu;


    @GetMapping("/posts/{user_id")
    public UserDTO getUserAndPosts (@PathVariable Long user_id){

        UserDTO user = servUsu.getUserAndPosts(user_id);
        return user;
    }




}
