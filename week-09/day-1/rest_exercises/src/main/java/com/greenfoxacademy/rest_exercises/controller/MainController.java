package com.greenfoxacademy.rest_exercises.controller;

import com.greenfoxacademy.rest_exercises.model.*;
import com.greenfoxacademy.rest_exercises.model.Appendable;
import com.greenfoxacademy.rest_exercises.model.Error;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndexPage() {
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/doubling", method = RequestMethod.GET)
    public Object doubleTheInput(@RequestParam(value = "input", required = false) Integer input) {
        if (input == null) {
            Error noInputError = new Error();
            noInputError.setError("Please provide an input!");
            return noInputError;
        } else {
            Doubling doubling = new Doubling(input);
            return doubling.doubleReceivedNumber();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/greeter", method = RequestMethod.GET)
    public Object greetWithInput(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        Greeter greeter = new Greeter();
        Error errorToShow = new Error();
        if (name == null && title == null) {
            errorToShow.setError("Please provide a name and a title!");
            return errorToShow;
        } else if (name == null) {
            errorToShow.setError("Please provide a name!");
            return errorToShow;
        } else if (title == null) {
            errorToShow.setError("Please provide a title!");
            return errorToShow;
        } else {
            greeter.setWelcome_message(name, title);
            return greeter;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
    public Object appendLetter(@PathVariable("appendable") String stringToAppend) {
        Appendable appendable = new Appendable();
        appendable.setAppended(stringToAppend);
        return appendable;
    }

    @ResponseBody
    @RequestMapping(value = "/dountil/{action}", method = RequestMethod.POST)
    public Object returnDoUntil(@PathVariable("action") String action, @RequestBody(required = false) Until until) {
        DoUntil doUntil = new DoUntil();
        if (until == null) {
            Error errorMessage = new Error();
            errorMessage.setError("Please provide a number!");
            return errorMessage;
        } else {
            doUntil.setResult(action, until.getUntil());
            return doUntil;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/arrays", method = RequestMethod.POST)
    public Object handleInputArray(@RequestBody ArrayRequest arrayRequest){
        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.setResult(arrayRequest.getWhat(), arrayRequest.getNumbers());
        return arrayHandler;
    }
}
