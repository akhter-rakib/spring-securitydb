package com.rakib.springsecuritydb.service;

import com.rakib.springsecuritydb.model.Role;
import com.rakib.springsecuritydb.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void addRole(Role role) {
        roleRepository.save(role);
    }
}
