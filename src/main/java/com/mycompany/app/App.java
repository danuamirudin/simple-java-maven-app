package com.mycompany.app;

/**
{
 * Hello world!
 }
 */

/** test lagi */

public class App
{

    private final String message = "Assalamu'alaikum";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
