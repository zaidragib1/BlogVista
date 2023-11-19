package com.example.blogappproject.services;

import com.example.blogappproject.Payloads.CommentDto;

public interface CommentService {

    //do comment
    CommentDto createComment(CommentDto commentDto, Integer postId);

    //delete comment
    void deleteComment(Integer commentId);
}
