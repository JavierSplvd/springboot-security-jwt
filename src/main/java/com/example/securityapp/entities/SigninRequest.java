package com.example.securityapp.entities;

public record SigninRequest(
                String password,
                String email) {
}