package com.greenfoxacademy.rest_exercises.model;

public class Doubling {
    private Integer result;
    private Integer received;

    public Doubling(int received) {
        this.received = received;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Doubling doubleReceivedNumber() {

        this.result = this.received * 2;
        return this;

    }
}
