package com.milenyumsoft.users_service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    private Long id;
    private String title;
    private Long user_id;


}
