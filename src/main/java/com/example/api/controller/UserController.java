package com.example.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.dto.UserDTO;

import com.example.api.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth/sign-up")
public class UserController {
    @Autowired
    private UserService service;

    @CrossOrigin(origins = "*")

    @PostMapping
    public void Create(@RequestBody @Valid UserDTO req) {
        service.save(req);

    }

}
