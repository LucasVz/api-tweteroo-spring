package com.example.api.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.api.dto.TweetsPostDTO;
import com.example.api.model.Tweets;
import com.example.api.repository.TweetsRepository;

@Service
public class TweetsService {

    @Autowired
    private TweetsRepository repository;

    public Tweets save(TweetsPostDTO dto) {
        return repository.save(new Tweets(dto));
    }

}
