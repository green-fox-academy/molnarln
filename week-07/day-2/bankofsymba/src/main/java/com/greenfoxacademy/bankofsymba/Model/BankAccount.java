package com.greenfoxacademy.bankofsymba.Model;

public class BankAccount {

    private String name;
    private Integer balance;
    private String animalTye;
    boolean isKing;
    boolean isGoodGuy;

    public BankAccount (String name, Integer balance, String animalTye, boolean isKing, boolean isGoodGuy){
        this.name = name;
        this.balance = balance;
        this.animalTye = animalTye;
        this.isKing = isKing;
        this.isGoodGuy = isGoodGuy;


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
