package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Maven!");
    }

    // Metodo add che gestisce anche numeri negativi
    public int add(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Attenzione: Somma con numeri negativi.");
        }
        return a + b;
    }
}
