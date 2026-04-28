package org.example;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses;
    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }
    public void addExpense(Expense e) {
        expenses.add(e);
    }
    public List<Expense> getAllExpenses() {
        return expenses;
    }
    public double totalExpenses() {
        double total=0;
        for (Expense each : expenses){
             total =  total + each.getAmount();

        }
        return total;
    }
}
