package com.api.expensetrack.entity;


import lombok.Data;

@Data
public class UserDTO {

    private String name;

    private String email;

    private String password;

    private Long age = 0L;
}
