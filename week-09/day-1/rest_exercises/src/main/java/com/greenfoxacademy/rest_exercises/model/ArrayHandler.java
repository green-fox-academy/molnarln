package com.greenfoxacademy.rest_exercises.model;


public class ArrayHandler {
    private Object result;

    public ArrayHandler() {
    }

    public Object getResult() {
        return result;
    }

    public void setResult(String what, Integer[] array) {
        Integer temp = 0;
        Integer temp2 = 1;
        Integer[] tempArray = new Integer[array.length];
        if (what.equalsIgnoreCase("sum")) {
            for (int i = 0; i < array.length; i++) {
                temp += array[i];
            }
            this.result = temp;
        } else if (what.equalsIgnoreCase("multiply")) {
            for (Integer i = 0; i < array.length; i++) {
                temp2 *= array[i];
            }
            this.result = temp2;
        } else if (what.equalsIgnoreCase("double")) {
            for (Integer i = 0; i < array.length; i++) {
                tempArray[i] = array[i] * 2;
                this.result = tempArray;
            }
        }
    }

    @Override
    public String toString() {
        return "ArrayHandler{" +
                "result=" + result.toString() +
                '}';
    }
}