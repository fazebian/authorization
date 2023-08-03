package com.sahia.authorization.dtos;

import jakarta.persistence.Column;

public class LoginUserDto {

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;
}
