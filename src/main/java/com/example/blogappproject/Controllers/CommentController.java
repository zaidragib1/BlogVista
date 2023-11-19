package com.example.blogappproject.Controllers;

import com.example.blogappproject.Payloads.ApiResponse;
import com.example.blogappproject.Payloads.CommentDto;
import com.example.blogappproject.Repository.PostRepo;
import com.example.blogappproject.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private PostRepo postRepo;

    @PostMapping("/post/{postId}")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @PathVariable Integer postId){

        CommentDto createComment = this.commentService.createComment(commentDto,postId);

        return new ResponseEntity<CommentDto>(createComment, HttpStatus.CREATED);

    }

    @DeleteMapping("/deleteComment/{commentId}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId){

        this.commentService.deleteComment(commentId);

        return new ResponseEntity<ApiResponse>(new ApiResponse("Comment deleted successfully!!",true), HttpStatus.OK);
    }
}
