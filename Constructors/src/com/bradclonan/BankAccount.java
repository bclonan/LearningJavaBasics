package com.bradclonan;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    //Creating constructors
    //Constructors are called automatically and only called once
    //at the start when we are creating the object
    //TIP : Constructors can be overloaded
    //If an empty constructor is called you can call a constructor with parameters to pass default values
    //NOTE: when creating a default/empty constructor the this method has to be the first line
    public BankAccount() {
        this(12346, 5.00, "Default Name", "Default Address", "default phone");
    }

    public BankAccount (int accountNumber, double balance, String name, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    //Getters and Setters
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " successful.  Your account now has a balance of " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed.  You have " + this.balance + " left in your account.");
        }
    }

    //Setter Methods
    //Account Number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    //Balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Name
    public void setName(String name) {
        this.name = name;
    }

    //Email
    public void setEmail(String email) {
        this.email = email;
    }

    //Phone Number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Getters
    //Account number
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }
}
