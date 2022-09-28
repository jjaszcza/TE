package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

   // public List<Accountable> getAccounts() {return accounts;}

    public Accountable[] getAccounts() {

        return accounts.toArray(new Accountable[accounts.size()]);
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }



    public boolean isVip () {
        int vipStatusAmount = 25000;
        int totalSumBalances = 0;
        for (Accountable item : accounts) {
            totalSumBalances += item.getBalance();
        }
        return totalSumBalances >= vipStatusAmount;
    }






}
