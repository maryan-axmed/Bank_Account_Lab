package org.example;

public class Main {
    public static void main(String[] args) {
//    method= this is a block of code that can be called upon (like a defined function used in Python)
//    in the main method, i will pass through the methods I have created in my BankAccount.java file
//        class        object     new class ();
        BankAccount accountOne = new BankAccount("Mary", "Ax", 1999 - 03 - 03, 234562, 0);
        // pass in statements according to the parameters defined when the constructor was made
        BankAccount accountTwo = new BankAccount("Amy", "Winehouse", 1976-11-24, 842948, 0);
//ask an account holder to cash in any amount they would like and return their current balance
        System.out.println("Hello " + accountTwo.firstName + ". The current balance of your account is " + accountTwo.deposit());
//ask an account holder to withdraw any amount they would like and return their current balance.
        System.out.println("Hello " + accountTwo.firstName + ". The current balance of your account is " + accountTwo.withdrawal());

    }
}
