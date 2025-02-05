package com.milenyumsoft.users_service.repository;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="post-service")
public interface IPostsAPI {

    
}
