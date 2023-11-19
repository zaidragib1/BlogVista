package com.example.blogappproject.Repository;

import com.example.blogappproject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String Email);

    //we have all stuffs such as findById,FindByemail,FindByname everything
    //in Jpa Repository so we jsut need to implement the JpaRepoditory.
}
