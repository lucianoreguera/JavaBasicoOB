package com.controlStructures;

public class IfElseIf {
    public static void main(String[] args) {

        String day = "Miércoles";

        // ejemplos comparar
        boolean compareNum = 5 == 5;
        boolean result = day.equals("Martes");

        // if else if

        if (day.equals("Lunes")) {
            System.out.println("Animo con la semana champions");

        } else if (day.equals("Martes")) {
            System.out.println("Martes con M de Me besas");

        } else if (day.equals("Miércoles")) {
            System.out.println("Miercoles con M de Me besas");

        } else if (day.equals("Jueves")) {
            System.out.println("Ya es juernes");

        } else if (day.equals("Viernes")) {
            System.out.println("Nos fuimos!");

        } else if (day.equals("Sabado")) {
            System.out.println("Nos murimos!");

        } else if (day.equals("Domingo")) {
            System.out.println("Depresión");
        } else {
            System.out.println("El día introducido no es un día válido.");
        }
    }
}
