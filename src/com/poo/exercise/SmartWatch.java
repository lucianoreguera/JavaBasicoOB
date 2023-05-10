package com.poo.exercise;

public class SmartWatch extends SmartDevice {
    double inches;
    String connectivity;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String trademark, String model, String color, double inches, String connectivity) {
        super(trademark, model, color);
        this.inches = inches;
        this.connectivity = connectivity;
    }

    @Override
    public String toString() {
        return "marca=" + trademark +
                ", modelo=" + model +
                ", color=" + color +
                ", pulgadas=" + inches +
                ", conectividad=" + connectivity;
    }
}
