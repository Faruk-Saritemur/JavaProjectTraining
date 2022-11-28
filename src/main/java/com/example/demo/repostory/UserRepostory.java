package com.example.demo.repostory;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.api.model.Users;

@Repository
public interface UserRepostory extends JpaRepository<Users, Long> {
    
    @Query("SELECT * FROM users WHERE id = ? AND name = ?")
    Users getAllUsers();
    
}
