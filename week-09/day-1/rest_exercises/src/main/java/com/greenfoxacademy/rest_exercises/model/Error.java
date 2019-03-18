package com.greenfoxacademy.rest_exercises.model;

public class Error {
    private String errorMessage;

    public Error() {
    }

    public String getError() {
        return errorMessage;
    }

    public Error setError(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    @Override
    public String toString() {
        return "Error{" +
                "errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
