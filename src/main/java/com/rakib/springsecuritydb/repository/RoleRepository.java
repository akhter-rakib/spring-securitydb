package com.rakib.springsecuritydb.repository;

import com.rakib.springsecuritydb.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByRole(String role);
}
