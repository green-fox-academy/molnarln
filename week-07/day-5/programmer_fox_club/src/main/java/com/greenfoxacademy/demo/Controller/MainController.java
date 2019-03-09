package com.greenfoxacademy.demo.Controller;

import com.greenfoxacademy.demo.Model.Fox;
import com.greenfoxacademy.demo.Model.FoxListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    FoxListService foxListService;

    @Autowired
    public MainController(FoxListService foxListService){
    this.foxListService = foxListService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showMain(@RequestParam(value = "name", required = false, defaultValue = "Mr. Fox") String name, Model model) {
        model.addAttribute("fox", foxListService.getFox(name));
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginSite() {
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String redirectToIndex(@RequestParam(value = "name") String name) {
        return "redirect:/?name=" + name;
    }

    @RequestMapping(value = "/nutritionstore", method = RequestMethod.GET)
    public String showNutriStore(Model model, @RequestParam(value = "name") String name){
        model.addAttribute("listOfFoods", foxListService.getAvailableFoods());
        model.addAttribute("listOfDrinks", foxListService.getAvailableDrinks());
        model.addAttribute("name", name);
        return "nutristore";
    }

    @RequestMapping(value = "/nutritionstore", method = RequestMethod.POST)
    public String setFoodAndDrink(@RequestParam(value = "name") String name, @RequestParam(value = "food") String food, @RequestParam(value = "drink") String drink) {
        foxListService.setFoodAndDrink(name, food, drink);
        return "redirect:/?name=" + name;
    }
}
