package com.backend.blogvista.entity;

import com.backend.blogvista.enums.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long id;
	
	@Column(unique = true,nullable = false)
	private String email;
	
	@Column(nullable = true)
	private String name;
	
	private String password;
	
	private String profilePicUrl;
	
	private UserRole role;

}
