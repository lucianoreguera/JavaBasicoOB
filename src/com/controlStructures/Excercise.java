package com.controlStructures;

public class Excercise {
    public static void main(String[] args) {
        String[] names = { "Luciano", "Ignacio", "María" };
        String results = "";

        for (String name : names) {
            results += name + ", ";
        }

        System.out.println(results);
    }
}
