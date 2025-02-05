package com.milenyumsoft.users_service.service;

import com.milenyumsoft.users_service.dto.PostDTO;
import com.milenyumsoft.users_service.dto.UserDTO;
import com.milenyumsoft.users_service.modelo.User;
import com.milenyumsoft.users_service.repository.IPostsAPI;
import com.milenyumsoft.users_service.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {


   @Autowired
   private IUserRepository userRepo;

   @Autowired
   private IPostsAPI postApi;

    @Override
    public UserDTO getUserAndPosts(Long user_id) {

        //1.- Datos del usuario de la  BD

        User user = userRepo.findById(user_id).orElse(null);


        //2.- Una vez que tengo los datos necesito los POSTEOS
        List<PostDTO> listPosts = postApi.getPostsByUserId(user_id);

        //3.- Traigo posteos desde la API de posteos

        UserDTO userDTO = new UserDTO(user.getUser_id(), user.getName(), user.getLastname(),user.getCellphone(), listPosts);

        //4.- Unificar datos del usuario _  Postos

        //5.- User DTO


        return userDTO;
    }



}
