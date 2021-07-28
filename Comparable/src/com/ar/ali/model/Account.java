package com.ar.ali.model;

public class Account implements Comparable <Account> {

    private int nroAccount;
    private double balance;

    public Account(int nroAccount, double balance) {
        this.nroAccount = nroAccount;
        this.balance = balance;
    }

    public int getNroAccount() {
        return nroAccount;
    }

    public void setNroAccount(int nroAccount) {
        this.nroAccount = nroAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Account o) {
        if(this.getNroAccount() > o.getNroAccount())
            return 1;
        if(this.getNroAccount() < o.getNroAccount())
            return -1;

        return 0;
    }

    @Override
    public String toString() {
        return "nroAccount=" + nroAccount;
    }
}
