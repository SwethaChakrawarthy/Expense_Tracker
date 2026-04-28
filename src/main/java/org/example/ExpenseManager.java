package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.time.LocalDate;
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
        double total = 0;
        for (Expense each : expenses) {
            total = total + each.getAmount();

        }
        return total;
    }

    public void saveTofile() {
        try {
            FileWriter writer = new FileWriter("Expense.txt");
            for (Expense each : expenses) {
                writer.write(each.getDescription() + "," + each.getCategory() + "," +
                        each.getAmount() + "," +
                        each.getDate() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file:" + e.getMessage());

        }
    }
    public void loadFromfile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Expense.txt"));
            String line;
            while((line = reader.readLine())!=null) {
                String[] data = line.split(",");
                String description = data[0];
                String category = data[1];
                double amount = Double.parseDouble(data[2]);
                LocalDate date = LocalDate.parse(data[3]);
                Expense e= new Expense(description,category,amount,date);
                expenses.add(e);

            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("Error reading file:" + e.getMessage());
        }
    }
}