package com.api.expensetrack.service;


import com.api.expensetrack.entity.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> getAllExpenses();
}
