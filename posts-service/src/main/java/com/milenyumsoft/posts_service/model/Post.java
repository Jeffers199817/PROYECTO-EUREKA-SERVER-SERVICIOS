package com.milenyumsoft.posts_service.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String title;
    @Column(name="user_id")
    private Long user_id;


}
