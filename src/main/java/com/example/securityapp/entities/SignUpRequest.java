package com.example.securityapp.entities;

public record SignUpRequest(
                String username,
                String password,
                String email) {
}