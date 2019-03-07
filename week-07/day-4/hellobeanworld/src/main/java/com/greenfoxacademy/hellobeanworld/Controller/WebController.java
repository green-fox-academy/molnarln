package com.greenfoxacademy.hellobeanworld.Controller;

import com.greenfoxacademy.hellobeanworld.Model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
public class WebController {
    private UtilityService utilityService;

    @Autowired
    public WebController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping(value = "/useful", method = RequestMethod.GET)
    public String showAllUtilities(Model model) {
        model.addAttribute("utilities", utilityService);
        return "index";
    }

    @RequestMapping(value = "/useful/colored", method = RequestMethod.GET)
    public String colorizeRandom(Model model) {
        model.addAttribute("utilities", utilityService);
        return "empty";
    }

    @RequestMapping(value = "/useful/email", method = RequestMethod.POST)
    //if we use get method, in the URL the email address will be visible
    public String validateEmail(@RequestParam("email") String email, Model model) {
        utilityService.validateEmail(email);
        model.addAttribute("email", email);
        model.addAttribute("color", utilityService.validateEmail(email));
        return "emailvalidator";
    }

    @RequestMapping(value = "/useful/encode", method = RequestMethod.GET)
    public String encode(Model model, @RequestParam("text") String text, @RequestParam("number") Integer number) {
        model.addAttribute("codedorencoded", utilityService.caesar(text, number));
        return "caesar";
    }

    @RequestMapping(value = "/useful/decode", method = RequestMethod.GET)
    public String decode(Model model, @RequestParam("text") String text, @RequestParam("number") Integer number) {
        model.addAttribute("codedorencoded", utilityService.caesar(text, number));
        return "caesar";
    }
}
