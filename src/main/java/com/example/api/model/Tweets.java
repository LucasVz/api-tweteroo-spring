package com.example.api.model;

import com.example.api.dto.TweetsDTO;
import com.example.api.dto.TweetsPostDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweets {

    // public Tweets(TweetsDTO data) {
    // this.username = data.username();
    // this.avatar = data.avatar();
    // this.tweet = data.tweet();
    // }

    public Tweets(TweetsPostDTO data) {
        this.username = data.username();
        this.tweet = data.tweet();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30, nullable = false)
    private String username;

    // @Column(length = 100, nullable = false)
    // private String avatar;

    @Column(length = 200, nullable = false)
    private String tweet;
}
