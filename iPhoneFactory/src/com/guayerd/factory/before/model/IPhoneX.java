package com.guayerd.factory.before.model;

import com.guayerd.apple.before.model.IPhone;

public class IPhoneX extends IPhone {

    public IPhoneX(int capacity, String color) {
        super("X", capacity, color, 3);
    }

    @Override
    public void encendiendo() {
        System.out.println("Prendiendo como iPhone X");
    }
}
