package org.example;
import java.time.LocalDate;
import java.util.Scanner;

//created a class named "BankAccount" and this should have the same name as the constructor
public class BankAccount {
    //    the following information are properties for out BankAccount class and these can be assigned with a value:
    String firstName;
    String lastName;
    int dateOfBirth;
    int accountNumber;
    int balance;

    //    create a constructor: has the same name as the class + not return type (i.e. no void, no string etc.)
//    define the parameters of the BankAccount constructor that that it will know what information to expect
//    make sure to define pass in the data type and the name for that data type e.g. String name
    public BankAccount(String inputFirstName, String inputLastName, int inputDateOfBirth, int inputAccountNumber, int balance) {
// in out main method, we have passed arguments to BankAccount and now we need to close the loop by assigning
//        the arguments we passed to the variable we have created:
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;

    }
//    my methods:
//      •deposit method: this method needs to take an amount of money and add it to the current balance
//                      can ask the account owner to input a number for how much they want to put in
//                      add this to the current balance which is 0.
//
//    public static void deposit() { // DO I NEED TO PASS PARAMETERS INTO THE PARENTHESES?- DON'T THINK SO RN
//        Scanner howMuch = new Scanner(System.in);
//        System.out.println("How much money would you like to deposit?: ");
//        int addAmount = howMuch.nextInt();
//        System.out.println("The current balance of account " + this.accountNumber + " is " + // NOT FINISHED, NEED TO ADD THIS.BALANCE
////                TO ADDAMOUNT VARIABLE
//    }
//
////      •withdrawal method:this method needs to take an amount of money and subtract it from the current balance
////                      can ask the account owner to input a number for how much they want to put in
////                      add this to the current balance which is 0.
//    public static void withdrawal(){ //DO I NEED TO PASS PARAMETERS INTO THE PARENTHESES?- DON'T THINK SO RN
//        Scanner howMuch = new Scanner(System.in);
//        System.out.println("How much money would you like to withdraw?: ");
//        int subtractAmount = howMuch.nextInt();
//        System.out.println(); //NOT FINISHED, NEED TO SUBTRACT THIS.BALANCE TO ADDAMOUNT VARIABLE
//    }
//
////      •interest method: this method will need to allow the account to pay the intrest
//    public static void interest(){
//
//    }
//
//
////    make getters
//    public String getFirstName(){
//        return this.firstName;
//    }
//    public String getLastName(){
//        return this.lastName;
//    }
//    public LocalDate getDateOfBirth(){
//        return this.dateOfBirth;
//    }
//    public int getAccountNumber(){
//        return this.accountNumber;
//    }
//    public int getBalance(){
//        return this.balance;
//    }
////    make setters
    }
}
