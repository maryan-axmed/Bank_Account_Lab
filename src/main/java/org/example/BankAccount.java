package org.example;
import java.time.LocalDate;
import java.util.Scanner;

//created a class named "BankAccount" and this should have the same name as the constructor
public class BankAccount {
    //    the following information are properties for out BankAccount class and these can be assigned with a value:
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private int accountNumber;
    private int balance;

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
        this.balance = 0; //we set the balance to 0 as every account balance will not be the same for every object

    }
//my methods:
//      •deposit method: this method needs to take an amount of money and add it to the current balance
//                      can ask the account owner to input a number for how much they want to put in
//                      add this to the current balance which is 0.

    public int deposit() {
        Scanner howMuch = new Scanner(System.in);
        System.out.println("How much money would you like to deposit?: ");
        int addAmount = howMuch.nextInt();
        this.balance += addAmount;
        return addAmount;

    }
//
//      •withdrawal method:this method needs to take an amount of money and subtract it from the current balance
//                      can ask the account owner to input a number for how much they want to put in
//                      add this to the current balance which is 0.
    public int withdrawal(){
        Scanner howMuch = new Scanner(System.in);
        System.out.println("How much money would you like to withdraw?: ");
        int subtractAmount = howMuch.nextInt();
        this.balance = this.balance - subtractAmount;
        return subtractAmount;
    }

//      •interest method: this method will need to allow the account to pay the interest to the account holder
    public int interest(){
//        i need to write something that will allow me to take the current balance and add a specific percentage of interest
        double interestRate = 0.4;
        this.balance = (int) (this.balance * interestRate);
        return this.balance;
    }

// why do we need getters and setter?-
// these are used so that we can access and modify private variables of classes
//    getter will retrieve value of private variable and setter will set the value of the private variable
//    make getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getDateOfBirth(){
        return dateOfBirth;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
//    make setters


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
