package com.greenfoxacademy.demo.Controller;

import com.greenfoxacademy.demo.Model.Fox;
import com.greenfoxacademy.demo.Model.FoxListService;
import com.sun.org.apache.xpath.internal.operations.Mod;
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

    private FoxListService foxListService;

    @Autowired
    public MainController(FoxListService foxListService) {
        this.foxListService = foxListService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showMain(@RequestParam(value = "name", required = false, defaultValue = "Mr. Fox") String name, Model model) {
        model.addAttribute("fox", foxListService.getFox(name));
        model.addAttribute("name", name);
        model.addAttribute("actionlog", foxListService.getFox(name).getActionLog());
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
    public String showNutriStore(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("listOfFoods", foxListService.getAvailableFoods());
        model.addAttribute("listOfDrinks", foxListService.getAvailableDrinks());
        model.addAttribute("name", name);
        return "nutristore";
    }

    @RequestMapping(value = "/nutritionstore", method = RequestMethod.POST)

    //-----WE CAN USE THAT SYNTAX TOO:
    //@RequestParam(value = "name") String name, @RequestParam(value = "food") String food, @RequestParam(value = "drink") String drink
    public String setFoodAndDrink(@RequestParam Map<String, String> map) {
        String foodBeforeChange = foxListService.getFox(map.get("name")).getFood();
        String drinkBeforeChange = foxListService.getFox(map.get("name")).getDrink();

        foxListService.setFoodAndDrink(map.get("name"), map.get("food"), map.get("drink"));
        if (!foodBeforeChange.equalsIgnoreCase(map.get("food"))) {
            foxListService.getFox(map.get("name")).addAction(foxListService.getDate() + " Food changed from: " + foodBeforeChange + " to: " + map.get("food"));
        }
        if (!drinkBeforeChange.equalsIgnoreCase(map.get("drink"))) {
            foxListService.getFox(map.get("name")).addAction(foxListService.getDate() + " Drink changed from: " + drinkBeforeChange + " to: " + map.get("drink"));
        }
        return "redirect:/?name=" + map.get("name");
    }

    @RequestMapping(value = "/trickCenter", method = RequestMethod.GET)
    public String showTrickCenter(Model model, String name) {
        model.addAttribute("tricks", foxListService.getListOfLearnableTricks());
        model.addAttribute("name", name);
        return "skillstore";
    }

    @RequestMapping(value = "/trickCenter", method = RequestMethod.POST)
    public String learnSkill(String trick, String name) {
        if (!foxListService.getFox(name).getTricks().contains(trick)) {
            foxListService.getFox(name).addAction(foxListService.getDate() + "Learned the following trick: " + trick);
        }
        foxListService.learnTrick(name, trick);
        return "redirect:/?name=" + name;
    }

    @RequestMapping(value = "/actionLog", method = RequestMethod.GET)
    public String showLogs(Model model, String name) {
        model.addAttribute("name", name);
        model.addAttribute("actionlog", foxListService.getFox(name).getActionLog());

        return "actionlog";
    }
}
