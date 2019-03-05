package com.greenfoxacademy.bankofsymba.controller;

import com.greenfoxacademy.bankofsymba.Model.BankAccount;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {
    BankAccount bankAccount;
    List<BankAccount> accountList;

    public WebController() {
        this.accountList = new ArrayList<>();
        BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true, true);
        BankAccount bankAccount2 = new BankAccount("Zordon", 6000, "lion", false, false);
        BankAccount bankAccount3 = new BankAccount("Zazu", 4500, "bird", false, true);
        BankAccount bankAccount4 = new BankAccount("Nala", 13000, "lion", false, true);
        BankAccount bankAccount5 = new BankAccount("Timon", 3400, "mongoose", false, true);
        accountList.add(bankAccount);
        accountList.add(bankAccount2);
        accountList.add(bankAccount3);
        accountList.add(bankAccount4);
        accountList.add(bankAccount5);

    }

    @RequestMapping(value = "/show")
    public String showAccount(Model model) {
        model.addAttribute("bankaccount", bankAccount);
        return "account";
    }

    @RequestMapping(value = "/show/htmlception")
    public String showHTMLception(Model model){
        String stringToAdd = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("bankaccount", bankAccount);
        model.addAttribute("string", stringToAdd);
        return "account";
    }

    @RequestMapping (value = "/accounts")
    public String showAccounts(Model model){
        model.addAttribute("accounts", accountList);
        return "listofaccounts";
    }
}
