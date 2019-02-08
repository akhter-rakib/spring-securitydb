package com.rakib.springsecuritydb.service;

import com.rakib.springsecuritydb.model.User;
import com.rakib.springsecuritydb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
