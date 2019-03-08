package com.greenfoxacademy.demo.Model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxListService {

    private List<Fox> foxList;

    public FoxListService(){
        foxList = new ArrayList<>();
        Fox fox1 = new Fox("Bela", Arrays.asList("swim", "run", "learn"),"meat", "water");
        Fox fox2 = new Fox("Karoly", Arrays.asList("read", "flex"),"meat", "water");
        Fox fox3 = new Fox("Zsigmond", Arrays.asList("jump", "code"),"meat", "water");
        foxList.add(fox1);
        foxList.add(fox2);
        foxList.add(fox3);
    }

    public List<Fox> getFoxList() {
        return foxList;
    }

    public void addFox(Fox fox) {
        this.foxList.add(fox);
    }

    public Fox getFox(String name){
        for (Fox fox:this.foxList) {
            if (fox.getName().equalsIgnoreCase(name)){
                return fox;
            }
        }
        return null;
    }


}
