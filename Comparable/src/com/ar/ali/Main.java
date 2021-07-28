package com.ar.ali;

import com.ar.ali.model.Account;
import com.ar.ali.model.Person;

public class Main {

    public static void main(String[] args) {

        Account cuenta = new Account(01, 20.5);
        Account cuenta2 = new Account(04, 20.5);
        Account cuenta3 = new Account(29, 150.9);
        Account cuenta4 = new Account(02, 55.5);

        Person persona = new Person("pepe", "asd", 25);
        persona.addAccount(cuenta, cuenta2, cuenta3, cuenta4);
        persona.addAccount(null);

        persona.getBalanceTotal();
        persona.viewAllAccounts();
        System.out.println(persona.getFullName());
    }
}
