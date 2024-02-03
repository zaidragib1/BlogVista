package com.backend.blogvista.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class ApiResponse {

    private String message;

    private boolean success;
}
