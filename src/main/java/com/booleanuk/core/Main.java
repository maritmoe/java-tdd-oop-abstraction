package com.booleanuk.core;


// Examples
public class Main {
    public static void main(String[] args) throws NegativeBalanceException {
        //PlayerCharacter pc = new PlayerCharacter("Dave", "The Magnificent");

        //System.out.println(pc.getName() + " " + pc.getTitle());
        //System.out.println("Health: " + pc.getHealth());
        //pc.boostHealth();
        //System.out.println("Health: " + pc.getHealth());

        BankAccount account = new BankAccount(25.43, "Dave", "123456", "12345678");
        //account.balance = 1000000.0;
        System.out.println("You have: £" + account.getBalance());
        try {
            account.depositAmount(-50.78);
        }
        catch (NegativeBalanceException e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("You have: £" + account.getBalance());


    }
}
