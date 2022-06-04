package com.api.expensetrack.entity;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserDTO {

    @NotBlank(message = "must provide name")
    private String name;

    @NotNull(message = "must provide email address")
    @Email(message = "invalid email address")
    private String email;

    @NotNull(message = "must provide password")
    @Size(min = 5, message = "password length must be at least 5 characters")
    private String password;

    private Long age = 0L;
}
