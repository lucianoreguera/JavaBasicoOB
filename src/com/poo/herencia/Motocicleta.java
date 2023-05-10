package com.poo.herencia;

import com.poo.Vehiculo;
import com.poo.Motor;

public class Motocicleta extends Vehiculo {
    boolean baul;

    public Motocicleta(){

    }

    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
