package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong atomicLong = new AtomicLong(1);

    @RequestMapping(value = "/greeting")
    @ResponseBody

    public Greeting greeting(@RequestParam("name") String name) {
        String content = "Hello";
        return new Greeting(atomicLong.getAndAdd(1), content + name);
    }
}

