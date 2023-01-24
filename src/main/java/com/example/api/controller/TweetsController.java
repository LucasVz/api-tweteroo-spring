package com.example.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.api.dto.TweetsPostDTO;
import com.example.api.service.TweetsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tweets")
public class TweetsController {
    @Autowired
    private TweetsService service;

    @CrossOrigin(origins = "*")

    @PostMapping
    public void Create(@RequestBody @Valid TweetsPostDTO req) {
        service.save(req);

    }

}
