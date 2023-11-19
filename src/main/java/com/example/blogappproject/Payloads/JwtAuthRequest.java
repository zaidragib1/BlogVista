package com.example.blogappproject.Payloads;

import lombok.Data;

@Data
public class JwtAuthRequest {

    private String username;

    private String password;
}
