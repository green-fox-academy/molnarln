package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Controller
public class WebApp {

    List<ShopItem> stock;

    public WebApp() {
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
    public String listOfShopItems(Model model) {
        model.addAttribute("stock", stock);
        return "index";
    }

    @GetMapping(value = "/webshop/only-available")
    public String listOfOnlyAvailableShopItems(Model model) {
        List<ShopItem> onlyAvailables;
        onlyAvailables = stock.stream()
                .filter(i -> i.getQuantityOfStock() != 0)
                .collect(Collectors.toCollection(ArrayList::new));
        model.addAttribute("stock", onlyAvailables);
        return "index";
    }

    @GetMapping(value = "/webshop/cheapest-first")
    public String cheapestFirst(Model model) {
        List<ShopItem> sortedByPrice;
        sortedByPrice = stock.stream()
                .sorted((a, b) -> (a.getPrice() >= b.getPrice()) ? 1 : -1)
                .collect(Collectors.toCollection(ArrayList::new));

        model.addAttribute("stock", sortedByPrice);
        return "index";
    }

    @GetMapping(value = "/webshop/contains-nike")
    public String containsNike(Model model) {
        List<ShopItem> nikeRelatedList;
        nikeRelatedList = stock.stream()
                .filter(e -> e.getDescription().toLowerCase().contains("nike") || e.getName().toLowerCase().contains("nike"))
                .collect(Collectors.toList());

        model.addAttribute("stock", nikeRelatedList);
        return "index";
    }

    @GetMapping(value = "/webshop/average-stock")
    public String averageStock(Model model) {
        OptionalDouble average;
        average = stock.stream()
                .mapToDouble(e -> (double) e.getQuantityOfStock())
                .average();
        model.addAttribute("typeOfData", "Average stock: ");
        model.addAttribute("dataOfItem", average.getAsDouble());
        return "dataOfItem";
    }

    @GetMapping(value = "/webshop/most-expensive")
    public String mostExpensive(Model model) {
        List<ShopItem> nameOfMostExpensive;
        nameOfMostExpensive = stock.stream()
                .sorted((a, b) -> a.getPrice() >= b.getPrice() ? -1 : 1)
                .limit(1)
                .collect(Collectors.toList());

        model.addAttribute("typeOfData", "Most expensive item is: ");
        model.addAttribute("dataOfItem", nameOfMostExpensive.get(0).getName());
        return "dataOfItem";
    }

    @PostMapping(value = "/webshop/search")
    public String search(Model model, @RequestParam("keyWord") String keyWord) {

        List<ShopItem> searchResults;
        searchResults = stock.stream()
                .filter(e -> e.getDescription().toLowerCase().contains(keyWord) || e.getName().toLowerCase().contains(keyWord))
                .collect(Collectors.toList());

        model.addAttribute("stock", searchResults);
        return "index";

    }
}
