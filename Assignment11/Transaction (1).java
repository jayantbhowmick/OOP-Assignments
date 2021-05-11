//Abhishek Dhar
//23201
//E-10
//Strategy Design Pattern


package Assignmets;

import java.util.Scanner;

public class Transaction {
    int timeStamp;
    String operation;

    Scanner scanner = new Scanner(System.in);
    int depositAmount(int b) {
        System.out.print("Enter amount to deposit : ");
        int depositAmount;
        depositAmount = scanner.nextInt();

        b += depositAmount;
        System.out.println("Rs " + depositAmount + " deposited in the account successfully!!");
        return b;
    }

    int withdrawAmount(int b) {
        System.out.print("Enter amount to withdraw : ");
        int withdrawalAmount;
        withdrawalAmount = scanner.nextInt();

        if(withdrawalAmount <= b) {
            b -= withdrawalAmount;
            System.out.println("Rs " + withdrawalAmount + " withdrawn successfully!!");
            return b;
        }
        else System.out.println("You don't have enough balance!!");
        return b;
    }

//    void checkBalance(int b) {
//        return b;
//    }
//    void deleteAccount() {}

}
