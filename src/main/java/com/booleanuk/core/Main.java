package com.booleanuk.core;


// Examples
public class Main {
    public static void main(String[] args) {
        //PlayerCharacter pc = new PlayerCharacter("Dave", "The Magnificent");

        //System.out.println(pc.getName() + " " + pc.getTitle());
        //System.out.println("Health: " + pc.getHealth());
        //pc.boostHealth();
        //System.out.println("Health: " + pc.getHealth());

        BankAccount account = new BankAccount(25.43, "Dave", "123456", "12345678");
        //account.balance = 1000000.0;
        System.out.println("You have: £" + account.getBalance());
        account.depositAmount(50.78);
        System.out.println("You have: £" + account.getBalance());
    }
}
