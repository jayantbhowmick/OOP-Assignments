//Abhishek Dhar
//23201
//E-10
//Strategy Design Pattern

//Java is a robust language

package Assignmets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Accounts[] accountObject = new Accounts[50];
        System.out.print("Enter number of accounts: ");
        int n = scanner.nextInt();
        int i;
        int abhishek=0,dhar=0;

        for(i = 0; i < n; i++) {
            accountObject[i] = new Accounts();
            accountObject[i].readAccountData();
        }

            for (Accounts accounts : accountObject) {

                System.out.println("***************** XYZ BANK SOLUTIONS *********************");
                scanner.nextLine();
                accountObject[i + 1] = new Accounts();
                System.out.print("Enter Username: ");
                String temporaryUsername = scanner.nextLine();
                int temporaryPin;

                while (!accounts.userName.equals(temporaryUsername)) {
                    System.out.print("Wrong User name!! Account not found!!\nEnter username again: ");
                    temporaryUsername = scanner.nextLine();
                }
                System.out.print("Pin: ");
                temporaryPin = scanner.nextInt();
//                    scanner.nextLine();
                while (accounts.pin != temporaryPin) {
                    System.out.print("Wrong pin!! Please enter correct pin:");
                    temporaryPin = scanner.nextInt();
                }
                // Here we have got correct pin and username

                while(true) {
                    abhishek++;
                    dhar++;

                int choice;
                System.out.println("""
                        ***********************************************
                        Select and enter an option:
                        1) Display details of account
                        2) Withdraw 
                        3) Deposit
                        4) Check balance
                        5) Pin change
                        6) To exit
                        ***********************************************
                        """);
                choice = scanner.nextInt();
                //Switch case for menu driven code
                switch (choice) {
                    case 1 -> {
                        System.out.println("*************** ACCOUNT DETAILS ***************");
                        accounts.displayAccountDetails();
                        System.out.println("***********************************************");
                    }
                    case 2 -> {
                        accounts.withdrawAmountFromAccount(accounts.balance);
                    }
                    case 3 -> {
                        accounts.depositAmountFromAccount(accounts.balance);

                    }
                    case 4 -> {
                        System.out.println("Balance: " + accounts.checkBalance());
                    }
                    case 5 -> {
                        System.out.print("Enter current pin: ");
                        {
                            int temporaryCurrentPin = scanner.nextInt();
                            if (temporaryCurrentPin == accounts.pin) {
                                System.out.print("Enter new pin: ");
                                accounts.pin = scanner.nextInt();
                                System.out.println("Pin changed successfully!! :)");
                            } else System.out.println("Invalid pin entered!!");
                        }
                    }
                    case 6 -> {
                        System.exit(0);
                    }
                    default -> System.out.println("Select a valid option");
                }
            }}
                }
            }


