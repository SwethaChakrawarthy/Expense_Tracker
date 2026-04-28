package org.example;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();
        expenseManager.loadFromfile();
        while(true) {
            System.out.print("\n"+"#####============Expense Tracker===========#####");
            System.out.print("\n"+"1. Add Expense "+"\n"+"2. View All Expenses"+"\n"+ "3. View Total "+"\n"+"4. Exit"+"\n");
            System.out.print("Enter your choice: ");
            switch (scanner.nextLine()) {

                case "1":
                    System.out.println("enter the description of the new expense");
                    String description = scanner.nextLine();
                    System.out.println("enter the category you want to save the expense as");
                    String category = scanner.nextLine();
                    System.out.println("enter the amount you want to save for expense ");
                    double amount = scanner.nextDouble();
                    Expense exp1 = new Expense(description, category, amount, LocalDate.now());

                    expenseManager.addExpense(exp1);
                    expenseManager.saveTofile();

                    break;
                case "2":
                    System.out.print(expenseManager.getAllExpenses().toString());
                    break;
                case "3":
                    System.out.print(expenseManager.totalExpenses());
                    break;
                case "4":
                    return;

            }
        }
        }


    }

