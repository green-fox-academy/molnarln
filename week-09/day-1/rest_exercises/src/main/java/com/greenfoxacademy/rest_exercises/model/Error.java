package com.greenfoxacademy.rest_exercises.model;

public class Error {
    private String errorMessage;
    private String valami;

    public Error() {
    }
    public String getError() {
        return errorMessage;
    }

    public void setError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Error{" +
                "errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
