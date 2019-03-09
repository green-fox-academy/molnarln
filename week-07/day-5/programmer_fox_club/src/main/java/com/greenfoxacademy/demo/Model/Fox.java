package com.greenfoxacademy.demo.Model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    //name, list of tricks, food and drink

    private String name;
    private List<String> tricks;
    private String food;
    private String drink;

    public Fox(String name, List<String> tricks, String food, String drink) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.tricks.addAll(tricks);
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void addTrick(String trick) {
        this.tricks.add(trick);
    }
}
