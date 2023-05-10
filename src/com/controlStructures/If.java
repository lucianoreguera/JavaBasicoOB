package com.controlStructures;

public class If {
    public static void main(String[] args) {
        int age = 19;
        boolean isGreater = age >= 18; // false

        if(isGreater) {
            System.out.println("Es mayor de edad");
        }

        if(age >= 18){
            System.out.println("Es mayor de edad");
        }
    }
}
