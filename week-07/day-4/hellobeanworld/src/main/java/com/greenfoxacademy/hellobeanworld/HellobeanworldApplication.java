package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.Model.MyColor;
import com.greenfoxacademy.hellobeanworld.Model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

    private MyColor myColor;

    @Autowired
    HellobeanworldApplication(@Qualifier("redcolor") MyColor myColor) {
        this.myColor = myColor;
    }

    public static void main(String[] args) {

        SpringApplication.run(HellobeanworldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myColor.printColor();
    }
}
