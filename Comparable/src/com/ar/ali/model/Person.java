package com.ar.ali.model;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private List<Account> accounts;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.accounts = new ArrayList<>();
    }

    public String getFullName() {
        return this.firstName+" "+this.lastName;
    }

    public boolean isOlder() {
        return this.age > 60;
    }

    public void addAccount(Account... account) {
        if(account != null && account.length > 0) {
            for(Account e : account) {
               this.accounts.add(e);
            }
        }
    }

    public void getBalanceTotal() {
        double count = 0;
        for (Account account : this.accounts) {
           count+=account.getBalance();
        }
        System.out.println("Tu balance total es: $"+count);
    }

    public void viewAllAccounts() {
        this.accounts.sort(null);
        System.out.println(this.accounts);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
