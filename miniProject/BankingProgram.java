package miniProject;

import java.util.Scanner;

public class BankingProgram {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 100.99;
        boolean iisRunning = true;
        int choice;

        while (iisRunning) {
            System.out.println("===============");
            System.out.println("BANKING PROGRAM");
            System.out.println("===============");
            System.out.println("1 : SHOW BALANCE");
            System.out.println("2 : DEPOSIT");
            System.out.println("3 : WITH DRAW");
            System.out.println("4 : EXIT");
            System.out.println("===============");

            System.out.print("Input your choice (1-4) : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBlance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withDraw(balance);
                case 4 -> iisRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        // BANGKING PROGRAM FOR BEGINNER
        // DECLARE VARIABLES
        // GET AND PROCESS USERS CHOICE
        // showBalance
        // deposit
        // withDraw
        // EXIT MASSAGE

        System.out.println("===============");
        System.out.println("THANK YOU, HAVE A NICE DAY");
        System.out.println("===============");

        sc.close();
    }

    static void showBlance(double balance) {
        System.out.println("===============");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {

        double amount;

        System.out.print("ENTER AN AMOUNT TO BE DEPOSITED : ");
        amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("===============");
            System.out.println("AMOUNT CANT BE NEGATIVE FOR DEPOSITED");
            return 0;
        } else {
            return amount;
        }
    }

    static double withDraw(double balance) {

        double amount;

        System.out.print("ENTER AMOUNT TO BE WITHDRAWN : ");
        amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("===============");
            System.out.println("INSUFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("===============");
            System.out.println("AMOUNT CANT BE NEGATIVE");
            return 0;
        } else {
            return amount;
        }
    }
}
