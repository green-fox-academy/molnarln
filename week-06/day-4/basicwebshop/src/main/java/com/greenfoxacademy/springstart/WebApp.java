package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebApp {

    List<ShopItem> stock;

    public WebApp(){
        this.stock = new ArrayList<>();
        ShopItem item1 = new ShopItem("Running shoes", "Nike running shoes for every day sport", 10000, 5);
        ShopItem item2 = new ShopItem("Printer", "Some HP printer that will print some pages", 3000, 2);
        ShopItem item3 = new ShopItem("Coca cola", "0.5L standard coke", 25, 0);
        ShopItem item4 = new ShopItem("Wokin", "Chicken with fried rice an WOKIN sauce", 119, 100);
        ShopItem item5 = new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1);
        stock.add(item1);
        stock.add(item2);
        stock.add(item3);
        stock.add(item4);
        stock.add(item5);
    }

    @RequestMapping(value = "/webshop")
    public String initializer(Model model){
        model.addAttribute("stock", stock);
        return "index";
    }
}
