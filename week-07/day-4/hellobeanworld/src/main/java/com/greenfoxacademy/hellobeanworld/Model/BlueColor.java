package com.greenfoxacademy.hellobeanworld.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bluecolor")

public class BlueColor implements MyColor {
    private Printer printer;

    @Autowired
    public BlueColor(Printer printer){
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is blue color!");
    }
}
