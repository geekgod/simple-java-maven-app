package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World 5!";
    // Add extra name
    private final String name = "Mr. Geekgod";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message + " " + name;
    }

}
