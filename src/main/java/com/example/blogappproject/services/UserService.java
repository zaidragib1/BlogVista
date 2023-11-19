package com.example.blogappproject.services;

import com.example.blogappproject.Payloads.UserDto;

import java.util.List;

public interface UserService {

    //UserDto registerNewUser(UserDto user);
    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user, Integer userId);
    UserDto getUserById(Integer userId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId);

    UserDto registerNewUser(UserDto userDto);
}
