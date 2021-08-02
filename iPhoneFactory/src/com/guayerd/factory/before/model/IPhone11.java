package com.guayerd.factory.before.model;

import com.guayerd.apple.before.model.IPhone;

public class IPhone11 extends IPhone {
    public IPhone11(int capacity, String color) {
        super("11", capacity, color, 3);
    }

    @Override
    public void encendiendo() {
        System.out.println("Prendiendo como iPhone 11");
    }
}
