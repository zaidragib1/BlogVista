package com.example.blogappproject.Payloads;

import lombok.Data;

@Data
public class JwtAuthResponse {

    //in response, we will get a token and user details
    private String token;

    private UserDto user;
}

