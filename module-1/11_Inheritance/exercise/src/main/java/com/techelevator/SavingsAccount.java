package com.techelevator;

public class SavingsAccount extends BankAccount {

    private final int SERVICE_CHARGE = 2;
    private final int MINIMUM_BALANCE = 150;

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {

        if (getBalance() - amountToWithdraw >= 2) {
            super.withdraw(amountToWithdraw);
            if (getBalance() < MINIMUM_BALANCE) {
                super.withdraw(SERVICE_CHARGE);
            }

        }
        return getBalance();
    }
}
