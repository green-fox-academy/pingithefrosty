package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

  static List<BankAccount> accountList = new ArrayList<>();

  @RequestMapping("/show")
  public String show(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.equals(modelConstructor(model, bankAccount));
    return "template";
  }

  @RequestMapping("/tester")
  public String tester(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.equals(modelConstructor(model, bankAccount));
    model.addAttribute("test1", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    model.addAttribute("test2", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "template";
  }

  @RequestMapping("/accounts")
  public String list(Model model) {
    accountList.add(new BankAccount("Simba", 2000, "lion"));
    accountList.add(new BankAccount("Timon", 1000, "meercat"));
    accountList.add(new BankAccount("Pumba", 3000, "warthog"));
    accountList.add(new BankAccount("Rafiki", 8000, "baboon"));
    model.addAttribute("accountList", accountList);
    return "accounts";
  }

    public Model modelConstructor(Model model, BankAccount bankAccount) {
      model.addAttribute("name", bankAccount.getName());
      model.addAttribute("balance", bankAccount.getBalance());
      model.addAttribute("animalType", bankAccount.getAnimalType());
      return model;
    }
}


/*
  In your controller create the first endpoint called /show
    Instantiate a new BankAccount("Simba", "2000", "lion")*/
