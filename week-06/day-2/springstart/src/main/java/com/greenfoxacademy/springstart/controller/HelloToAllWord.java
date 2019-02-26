package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloToAllWord {

    @RequestMapping("/web/greetingtoall")
    public String greeting(Model model) {

        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
        int a = (int) (Math.random() * hellos.length);

        String[] colors = {"#ff0000", "#00ff00", "#0000ff", "#ff5733"};

        int randColor = (int) (Math.random() * colors.length);
        int randSize = (int) (Math.random() * 50);

        model.addAttribute("size", randSize);
        model.addAttribute("randomColor", colors[randColor]);
        model.addAttribute("randomHello", hellos[a]);
        model.addAttribute("hellos", hellos);

        return "greetingtoall";
    }
}
