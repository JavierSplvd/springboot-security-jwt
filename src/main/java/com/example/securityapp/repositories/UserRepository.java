package com.example.securityapp.repositories;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository {
    Optional<UserDetails> findByEmail(String email);
    void save(UserDetails user);
}