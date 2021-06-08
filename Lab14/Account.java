package com.files.Lab14;

import java.io.Serializable;

public class Account implements Serializable{

    private int acctNum;
    private int amount;

    public Account(int accountNumber, int amount) {
        this.acctNum = accountNumber;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return acctNum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAccountNumber(int accountNumber) {
        this.acctNum = accountNumber;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
