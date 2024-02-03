package com.backend.blogvista.service;

import com.backend.blogvista.Config.JwtProvider;
import com.backend.blogvista.entity.User;
import com.backend.blogvista.Exception.UserException;
import com.backend.blogvista.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

	private UserRepository userRepository;
	private JwtProvider jwtProvider;
	
	public UserService(UserRepository userRepository,JwtProvider jwtProvider){
		this.userRepository=userRepository;
		this.jwtProvider=jwtProvider;
	}
	
	public User findUserById(Long userId) throws UserException {
		Optional<User>user = userRepository.findById(userId);
		if(user.isPresent()) {
			return user.get();
		}
		throw new UserException("user not with id "+userId);
	}

	public User findUserProfileByJwt(String jwt) throws UserException {
		
		String email = jwtProvider.getEmailFromToken(jwt);
		
		User user = userRepository.findByEmail(email);
		
		if(user==null) {
			throw new UserException("user not found with email "+email);
		}
		
		return user;
	}
	
	
	
}
