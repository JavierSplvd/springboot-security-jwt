package com.example.securityapp.entities;

public record SigninRequest(
        String username,
        String password) {
}