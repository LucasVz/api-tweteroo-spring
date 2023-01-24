package com.example.api.dto;

import jakarta.validation.constraints.NotBlank;

public record TweetsPostDTO(
        @NotBlank String username,
        @NotBlank String tweet) {

}
