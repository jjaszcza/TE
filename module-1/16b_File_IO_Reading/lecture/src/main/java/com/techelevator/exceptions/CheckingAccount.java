package com.techelevator.exceptions;

public class CheckingAccount {
    private int balance = 0;


    public CheckingAccount(int balance) {
        this.balance = balance;
    }
    //with checked exception
    public int withdraw(int amount)   {

        //defensive programming
       if (amount < 0) {
           throw new IllegalArgumentException("cannot withdraw negative amount");
       }

        if (amount > balance) {
            throw new IllegalArgumentException("cannot withdraw more than the balance");
        }

        balance -= amount; //happy path
        return balance;
    }
}
