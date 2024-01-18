package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


// Example related to Bob's bagels
class BankAccountTest {

    @Test
    void getBalance() {
        BankAccount account = new BankAccount(10.05);
        // Delta says what accuracy you are looking for.
        Assertions.assertEquals(10.05, account.getBalance(), 0.0001);
    }

    @Test
    void setBalance() {
    }

    @Test
    void depositAmount() {
    }

    @Test
    void getAccountHolderName() {
    }

    @Test
    void setAccountHolderName() {
    }

    @Test
    void getBranchCode() {
    }

    @Test
    void setBranchCode() {
    }

    @Test
    void getAccountNumber() {
    }

    @Test
    void setAccountNumber() {
    }
}