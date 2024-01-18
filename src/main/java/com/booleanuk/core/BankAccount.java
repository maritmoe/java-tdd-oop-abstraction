package com.booleanuk.core;

// Example from morning activity
public class BankAccount {
    private int balance;
    String accountHolderName;
    String branchCode;
    String accountNumber;

    public BankAccount(double balance) {
        this.setBalance(balance);
    }
    public BankAccount(String accountHolderName) {

        this.accountHolderName = accountHolderName;
    }

    public BankAccount(double balance, String accountHolderName) {
        this.setBalance(balance);
        this.accountHolderName = accountHolderName;
    }

    public BankAccount(double balance, String accountHolderName, String branchCode,
                       String accountNumber) {
        this.setBalance(balance);
        this.accountHolderName = accountHolderName;
        this.branchCode = branchCode;
        this.accountNumber = accountNumber;
    }

    // Accessor
    // 2543 -> 25.43
    public double getBalance() {
        return (double)(this.balance / 100.0);
    }

    // Mutator, changes the value
    // double 25.43 -> int 2543
    public void setBalance(double balance) {
        this.balance = (int)(balance * 100);
    }

    public void depositAmount(double deposit) throws NegativeBalanceException {
        if (deposit < 0.0) {
            throw new NegativeBalanceException();
        }
        double newBalance = this.getBalance() + deposit;
        this.setBalance(newBalance);
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getBranchCode() {
        return this.branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
