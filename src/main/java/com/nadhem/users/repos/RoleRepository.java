package com.nadhem.users.repos;

import com.nadhem.users.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findRoleByRole(String role);
}
