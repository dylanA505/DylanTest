package com.company.simpleCoding;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;


    public BankAccount() {
        // (this) method should be used first line in order to call the other constructor from this constructor
        this(110110, 10.00, "Default name", "Default email", "Default phone number");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String emailAddress, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;

    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void depositFunds(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed. New balance is: " + this.accountBalance);

    }

    public void withdrawFunds(double withdrawAmount) {
        if (this.accountBalance - withdrawAmount < 0) {
            System.out.println("Only " + this.accountBalance + " available, Withdraw not processed");
        } else {
            this.accountBalance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " processed. Remaining balance is: " + this.accountBalance);
        }
    }
}
