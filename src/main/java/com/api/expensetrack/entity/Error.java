package com.api.expensetrack.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Error {

    private Integer statusCode;

    private String message;

    private Date timestamp;
}
