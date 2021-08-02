package com.guayerd.apple.before.model;

import com.guayerd.factory.before.model.IPhone11;
import com.guayerd.factory.before.model.IPhoneX;

public abstract class IPhone {
    private String model;
    private int capacity;
    private String color;
    private int cameras;

    public IPhone(String model, int capacity, String color, int cameras) {
        this.model = model;
        this.capacity = capacity;
        this.color = color;
        this.cameras = cameras;
    }

    public abstract void encendiendo();


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCameras() {
        return cameras;
    }

    public void setCameras(int cameras) {
        this.cameras = cameras;
    }


}
