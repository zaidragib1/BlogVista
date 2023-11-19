package com.example.blogappproject.services;

import com.example.blogappproject.Payloads.PostDto;
import com.example.blogappproject.Payloads.PostResponse;

import java.util.List;

public interface PostService {

    //create
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    //update
    PostDto updatePost(PostDto postDto, Integer postId);

    //delete
    void deletePost(Integer postId);

    //get post by Id
    PostDto getPostById(Integer postId);

    //Get Post By Category
    List<PostDto>getPostByCategory(Integer CategoryId);

    //Get Post By User
    List<PostDto> getPostByUser(Integer userId);

    //Get All User
    PostResponse getAllPost(Integer pageNumber,Integer pageSize, String sortBy, String sortDir);

    List<PostDto> getPostsByCategory(Integer categoryId);

    List<PostDto> getPostsByUser(Integer userId);

    //search post
    List<PostDto> searchPosts(String keywords);
}
