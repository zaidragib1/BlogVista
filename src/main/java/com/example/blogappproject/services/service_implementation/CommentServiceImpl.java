package com.example.blogappproject.services.service_implementation;

import com.example.blogappproject.Exceptions.ResourceNotFoundException;
import com.example.blogappproject.Entity.Comment;
import com.example.blogappproject.Entity.Post;
import com.example.blogappproject.Payloads.CommentDto;
import com.example.blogappproject.Repository.CommentRepo;
import com.example.blogappproject.Repository.PostRepo;
import com.example.blogappproject.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import javax.xml.stream.events.Comment;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {
        Post post = postRepo.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "post id ", postId));

        Comment comment = this.modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);

        Comment savedComment = this.commentRepo.save(comment);

        return this.modelMapper.map(savedComment, CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {
        Comment comment = (Comment) commentRepo.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment", "CommentId", commentId));

        this.commentRepo.delete(comment);
    }
}
