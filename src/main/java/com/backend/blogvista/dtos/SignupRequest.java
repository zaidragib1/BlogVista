package com.backend.blogvista.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignupRequest {
    @NotBlank
    private String name;
    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

}
