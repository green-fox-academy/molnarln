package com.greenfoxacademy.hellobeanworld.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("redcolor")
public class RedColor implements MyColor {

    private Printer printer;

    @Autowired
    public RedColor(Printer printer){
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is red color!");
    }
}
