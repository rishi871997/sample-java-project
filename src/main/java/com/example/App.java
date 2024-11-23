package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Keep the application running
        try {
            Thread.sleep(Long.MAX_VALUE); // Keeps the app running indefinitely
        } catch (InterruptedException e) {
            System.out.println("Application interrupted: " + e.getMessage());
        }
    }
}
