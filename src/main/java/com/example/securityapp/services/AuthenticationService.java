package com.example.securityapp.services;

import com.example.securityapp.entities.JwtAuthenticationResponse;
import com.example.securityapp.entities.SignUpRequest;
import com.example.securityapp.entities.SigninRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}