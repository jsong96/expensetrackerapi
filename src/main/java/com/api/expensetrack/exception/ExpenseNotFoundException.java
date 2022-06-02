package com.api.expensetrack.exception;

public class ExpenseNotFoundException extends RuntimeException{

    public ExpenseNotFoundException(String message) {
        super(message);
    }
}
