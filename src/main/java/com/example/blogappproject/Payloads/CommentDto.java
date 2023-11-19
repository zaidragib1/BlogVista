package com.example.blogappproject.Payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Setter
@Getter
public class CommentDto {

    private Integer id;

    private String content;
}