package com.example.openfeign.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String email;
    private String password;
    private Integer loginCount;
    private LocalDate lastLoginTime;
}
