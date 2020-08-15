package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("*********MENU*********");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("**********************");
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("***INTERNATIONAL INTERBANK SYSTEM***");
        System.out.print("Enter Name: ");
        String name = scan.nextLine();
        System.out.println("ACCOUNT FOUND IN BRAZIL BRADESCO BANK");

        int option;
        double balance = 500;

        do {
            System.out.println("");
            System.out.println("***INTERNATIONAL INTERBANK SYSTEM***");
            System.out.println("");
            System.out.println("ACCOUNT NAME: " + name);
            System.out.println("");

            showMenu();
            System.out.print("Option: ");
            option = scan.nextInt();
            System.out.print("\033[H\033[2J");

            switch (option) {
                case 1:
                    System.out.println("Balance is: US$ " + balance);
                    break;
                case 2:
                    System.out.print("Deposit Amount: US$ ");
                    double depositAmount = scan.nextDouble();
                    balance += depositAmount;
                    break;
                case 3:
                    System.out.print("Withdraw Amount: US$ ");
                    double withdrawAmount = scan.nextDouble();
                    balance -= withdrawAmount;
                    break;
            }

        } while (option != 4);
        System.out.println("EXITING THE SYSTEM....");


    }
}
