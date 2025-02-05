package com.milenyumsoft.users_service.service;

import com.milenyumsoft.users_service.dto.UserDTO;


public interface IUserService {


    public UserDTO getUserAndPosts(Long user_id);
}
