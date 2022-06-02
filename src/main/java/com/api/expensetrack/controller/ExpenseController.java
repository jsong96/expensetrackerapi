package com.api.expensetrack.controller;

import com.api.expensetrack.entity.Expense;
import com.api.expensetrack.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @GetMapping("/expenses/{id}")
    public Expense getExpenseById(@PathVariable("id") Long id) {
        return null;
    }

    @DeleteMapping("/expenses")
    public Expense deleteExpenseById(@RequestParam("id") Long id) {
        return null;
    }
}
