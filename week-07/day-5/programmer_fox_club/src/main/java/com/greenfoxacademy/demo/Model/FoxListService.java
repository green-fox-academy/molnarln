package com.greenfoxacademy.demo.Model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxListService {

    private List<Fox> foxList;
    private List<String> listOfAvailableFoods;
    private List<String> listOfAvailableDrinks;
    private List<String> listOfLearnableTricks;
    private Date date;


    public FoxListService() {
        this.foxList = new ArrayList<>();
        initialiseLists();
        this.date = new Date();
    }

    public String getDate(){
        return this.date.toString();
    }

    private void initialiseLists() {
        Fox fox1 = new Fox("Bela", Arrays.asList("jump", "say hello", "travel"), "meat", "water");
        Fox fox2 = new Fox("Karoly", Arrays.asList("read", "flex"), "meat", "water");
        Fox fox3 = new Fox("Zsigmond", Arrays.asList("jump", "code"), "meat", "water");
        this.foxList.add(fox1);
        this.foxList.add(fox2);
        this.foxList.add(fox3);
        this.listOfAvailableFoods = new ArrayList<>(Arrays.asList("Meat", "Bone", "Lasagne", "Banana"));
        this.listOfAvailableDrinks = new ArrayList<>(Arrays.asList("Coca Cola", "Pepsi", "Water", "Soda water"));
        this.listOfLearnableTricks = new ArrayList<>(Arrays.asList("Read", "Ride a horse", "Drive a car", "Swim", "Sing", "Jump"));
    }

    public List<String> getListOfLearnableTricks() {
        return listOfLearnableTricks;
    }

    public List getAvailableFoods() {
        return this.listOfAvailableFoods;
    }

    public List getAvailableDrinks() {
        return this.listOfAvailableDrinks;
    }

    public List<Fox> getFoxList() {
        return foxList;
    }

    public void addFox(Fox fox) {
        this.foxList.add(fox);
    }

    public Fox getFox(String name) {
        Fox a;
        a = foxList.stream()
                .filter(i -> i.getName().equalsIgnoreCase(name.toLowerCase()))
                .findFirst()
                .orElse(new Fox(name, Arrays.asList(), " ", " "));
        foxList.add(a);
        return a;

  /* <------------------THE FOLLOWING CODE ALSO WORKS, BUT THE UPPER IS MUCH SIMPLER.---------------------------------->

        for (Fox fox : this.foxList) {
            if (fox.getName().equalsIgnoreCase(name)) {
                return fox;
            } else {
                this.foxList.add(new Fox(name, Arrays.asList(), " ", " "));
                for (Fox foxnew : this.foxList) {
                    if (foxnew.getName().equalsIgnoreCase(name)){
                        return foxnew;
                    }
                }
            }
        }
        return null;*/
    }

    public void setFoodAndDrink(String name, String food, String drink) {
        for (Fox fox : foxList) {
            if (fox.getName().equalsIgnoreCase(name)) {
                fox.setFood(food);
                fox.setDrink(drink);
            }
        }
    }

    public void learnTrick(String name, String trickToLearn) {
        Fox f = foxList.stream()
                .filter(i -> i.getName().equalsIgnoreCase(name.toLowerCase()))
                .findFirst()
                .orElse(null);

        Long s = f.getTricks().stream()
                .filter(i -> i.equalsIgnoreCase(trickToLearn.toLowerCase()))
                .count();

        if (s == 0) {
            f.addTrick(trickToLearn);
        }
    }
}
