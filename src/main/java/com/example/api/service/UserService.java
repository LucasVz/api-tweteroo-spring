package com.example.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.dto.UserDTO;
import com.example.api.model.Users;
import com.example.api.repository.UserRepository;

import jakarta.validation.Valid;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Users Create(UserDTO dto) {
        return repository.save(new Users(dto));
    }

    public void save(@Valid UserDTO req) {
    }
}
