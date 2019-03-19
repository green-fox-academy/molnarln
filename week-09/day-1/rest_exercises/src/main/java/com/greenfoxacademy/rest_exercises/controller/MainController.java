package com.greenfoxacademy.rest_exercises.controller;

import com.greenfoxacademy.rest_exercises.model.*;
import com.greenfoxacademy.rest_exercises.model.Appendable;
import com.greenfoxacademy.rest_exercises.model.Error;
import com.greenfoxacademy.rest_exercises.service.LogService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    private LogService logService;

    @Autowired
    public MainController(LogService logService) {
        this.logService = logService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndexPage() {
        Log log = new Log("/", "index.html");
        logService.saveLog(log);
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/doubling", method = RequestMethod.GET)
    public Object doubleTheInput(@RequestParam(value = "input", required = false) Integer input) {
        if (input == null) {
            Error noInputError = new Error();
            noInputError.setError("Please provide an input!");
            Log log = new Log("/doubling", noInputError.toString());
            logService.saveLog(log);
            return noInputError;
        } else {
            Doubling doubling = new Doubling(input);
            Log log = new Log("/doubling", doubling.doubleReceivedNumber().toString());
            logService.saveLog(log);
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
            Log log = new Log("/greeter", errorToShow.toString());
            logService.saveLog(log);
            return errorToShow;
        } else if (name == null) {
            errorToShow.setError("Please provide a name!");
            Log log = new Log("/greeter", errorToShow.toString());
            logService.saveLog(log);
            return errorToShow;
        } else if (title == null) {
            errorToShow.setError("Please provide a title!");
            Log log = new Log("/greeter", errorToShow.toString());
            logService.saveLog(log);
            return errorToShow;
        } else {
            greeter.setWelcome_message(name, title);
            Log log = new Log("/greeter", greeter.toString());
            logService.saveLog(log);
            return greeter;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
    public Object appendLetter(@PathVariable("appendable") String stringToAppend) {
        Appendable appendable = new Appendable();
        appendable.setAppended(stringToAppend);
        Log log = new Log("/appenda/"+stringToAppend, appendable.toString());
        logService.saveLog(log);

        return appendable;
    }

    @ResponseBody
    @RequestMapping(value = "/dountil/{action}", method = RequestMethod.POST)
    public Object returnDoUntil(@PathVariable("action") String action, @RequestBody(required = false) Until until) {
        DoUntil doUntil = new DoUntil();
        if (until == null) {
            Error errorMessage = new Error();
            errorMessage.setError("Please provide a number!");
            Log log = new Log("/dountil/"+action, errorMessage.toString());
            logService.saveLog(log);
            ResponseEntity responseEntity = new ResponseEntity("Not found", HttpStatus.NOT_FOUND);
            return responseEntity;
        } else {
            doUntil.setResult(action, until.getUntil());
            Log log = new Log("/dountil/"+action, doUntil.toString());
            logService.saveLog(log);
            return doUntil;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/arrays", method = RequestMethod.POST)
    public Object handleInputArray(@RequestBody(required = false) ArrayRequest arrayRequest) {
        ArrayHandler arrayHandler = new ArrayHandler();
        Error errorMessage = new Error();
        if (arrayRequest.getWhat()==null) {
            errorMessage.setError("Please provide what to do with the numbers!");
            Log log = new Log("/arrays", errorMessage.toString());
            logService.saveLog(log);
            return errorMessage;
        } else if (arrayRequest.getNumbers() == null) {
            errorMessage.setError("Please provide numbers!");
            Log log = new Log("/arrays", errorMessage.toString());
            logService.saveLog(log);
            return errorMessage;
        } else {
            arrayHandler.setResult(arrayRequest.getWhat(), arrayRequest.getNumbers());
            Log log = new Log("/arrays", arrayHandler.toString());
            logService.saveLog(log);
            return arrayHandler;
        }
    }
    @ResponseBody
    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public Object showLogEntries(){
        LogEntries logEntries = new LogEntries();
        logService.setLogList(logEntries);
        logService.setLogCount(logEntries);
        return logEntries;

    }
}
