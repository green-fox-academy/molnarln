package com.greenfoxacademy.rest_exercises.model;

public class Appendable {

    private String appended;

    public Appendable() {
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String stringToAppend) {
        this.appended = stringToAppend.concat("a");
    }
}
