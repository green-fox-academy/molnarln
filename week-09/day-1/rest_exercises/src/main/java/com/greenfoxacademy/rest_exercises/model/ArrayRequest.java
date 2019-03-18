package com.greenfoxacademy.rest_exercises.model;

public class ArrayRequest {
    private String what;
    private Integer[] numbers;

    public ArrayRequest() {
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public Integer[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer[] numbers) {
        this.numbers = numbers;
    }
}
