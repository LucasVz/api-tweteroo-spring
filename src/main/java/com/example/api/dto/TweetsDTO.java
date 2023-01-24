package com.example.api.dto;

import jakarta.validation.constraints.NotBlank;

public record TweetsDTO(
        @NotBlank String username,
        @NotBlank String avatar,
        @NotBlank String tweet) {
}