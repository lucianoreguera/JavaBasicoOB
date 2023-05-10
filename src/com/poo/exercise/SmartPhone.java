package com.poo.exercise;

public class SmartPhone extends SmartDevice {
    int ram;
    String system;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String trademark, String model, String color, int ram, String system) {
        super( trademark, model, color);
        this.ram = ram;
        this.system = system;
    }

    @Override
    public String toString() {
        return "marca=" + trademark +
                ", modelo=" + model +
                ", color=" + color +
                ", ram=" + ram +
                ", sistema=" + system;
    }
}
