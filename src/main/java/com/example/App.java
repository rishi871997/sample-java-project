package com.example;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Hello, World!");

            // Sleep for 1 hour (3600 seconds = 3600000 milliseconds)
            Thread.sleep(3600000);

            System.out.println("Hello, World!");
        } catch (InterruptedException e) {
            System.out.println("Application interrupted: " + e.getMessage());
        }
    }
}
