package org.example;

import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private int balance;
//    create a constructor:
    public BankAccount(String inputFirstName, String inputLastName, LocalDate inputDateofBirth, int inputAccountNumber){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateofBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;
    }
}
