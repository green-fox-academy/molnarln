package com.greenfoxacademy.bankofsymba.Model;

public class BankAccount {

    private String name;
    private int balance;
    private String animalTye;
    private boolean king;
    private boolean goodGuy;

    public BankAccount() {
    }

    public BankAccount(String name, Integer balance, String animalTye, boolean king, boolean goodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalTye = animalTye;
        this.king = king;
        this.goodGuy = goodGuy;
    }

    public void setGoodGuy(boolean goodGuy) {
        this.goodGuy = goodGuy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseBalance() {
        if (this.king) {
            this.balance += 100;
        } else {
            this.balance += 10;
        }
    }

    public void setAnimalTye(String animalTye) {
        this.animalTye = animalTye;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAnimalTye() {
        return animalTye;
    }

    public boolean isKing() {
        return king;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isGoodGuy() {
        return goodGuy;
    }
}
