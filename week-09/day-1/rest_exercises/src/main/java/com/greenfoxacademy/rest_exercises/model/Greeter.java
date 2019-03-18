package com.greenfoxacademy.rest_exercises.model;

public class Greeter {

    private String welcome_message;

    public Greeter() {
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String name, String title) {
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }
}
