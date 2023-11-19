package com.example.blogappproject.Repository;

import com.example.blogappproject.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {


}
