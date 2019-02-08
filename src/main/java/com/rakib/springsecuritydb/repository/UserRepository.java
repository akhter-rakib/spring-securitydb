package com.rakib.springsecuritydb.repository;

import com.rakib.springsecuritydb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}
