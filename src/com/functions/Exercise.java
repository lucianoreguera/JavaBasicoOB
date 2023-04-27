package com.functions;

public class Exercise {
    public static void main(String[] args) {
        double price = 1000;
        double priceIVA = IVACalculate(price);

        System.out.println("El precio final (IVA incluido) es: " + priceIVA);
    }

    private static double IVACalculate(double price) {
        double IVA = 21;
        double finalPrice = price + (price * 0.21);

        return finalPrice;
    }
}
