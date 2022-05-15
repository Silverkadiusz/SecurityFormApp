package com.example.securityformapplication.user;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
    void deleteByEmail(String email);
    List<User> findAllUsersByRoles_Name(String userRole);
}
