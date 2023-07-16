package com.example.securityapp.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.example.securityapp.entities.User;

@Component
public class UserRepositoryImpl implements UserRepository {
    @Override
    public Optional<UserDetails> findByEmail(String username) {
        if (username.equals("uuu")) {
            UserDetails user = new User("uuu", "1234",
                    "foo@gmail.com",
                    new ArrayList<>());
            return Optional.of(user);
        }
        return Optional.empty();
    }

    @Override
    public void save(UserDetails user) {
        return;
    }
}
