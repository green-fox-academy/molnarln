package com.greenfoxacademy.bankofsymba.Model;

public class BankAccount {

    private String name;
    private int balance;
    private String animalTye;
    private boolean isKing;
    private boolean isGoodGuy;

    public BankAccount() {

    }

    public BankAccount(String name, Integer balance, String animalTye, boolean isKing, boolean isGoodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalTye = animalTye;
        this.isKing = isKing;
        this.isGoodGuy = isGoodGuy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseBalance() {
        if (this.isKing) {
            this.balance += 100;
        } else {
            this.balance += 10;
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAnimalTye(String animalTye) {
        this.animalTye = animalTye;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public void setGoodGuy(boolean goodGuy) {
        isGoodGuy = goodGuy;
    }

    public boolean isGoodGuy() {
        return isGoodGuy;
    }

    public boolean isKing() {
        return isKing;
    }

    public String getName() {
        return name;
    }

    public Integer getBalance() {
        return balance;
    }

    public String getAnimalTye() {
        return animalTye;
    }
}
