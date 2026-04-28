package org.example;

import java.time.LocalDate;


public class Expense {
    private double amount;
    private String category;
    private LocalDate date;
    private String description;

    public Expense(String description, String category, double amount, LocalDate date) {
        this.description = description;
        this.date = date;
        this.category = category;
        this.amount = amount;
    }

public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "\n"+"Description: " + description + "\n"+
                " Category: " + category + "\n" +
        " Date: " + LocalDate.now() + "\n"+
                " Amount: " + amount + "\n";
    }
}


