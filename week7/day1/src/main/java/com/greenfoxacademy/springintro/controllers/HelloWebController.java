package com.greenfoxacademy.springintro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong manyTimes = new AtomicLong(0);

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  String[] color = {"red", "yellow", "blue", "green", "orange", "purple", "pink"};

  String[] fsize = {"20", "30", "40", "50", "60"};

  String[] ffamily = {"Arial", "Georgia", "Times New Roman", "Verdana", "Tahoma"};

  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("hello", hellos[(int) (Math.random() * hellos.length)]);
    model.addAttribute("color", color[(int) (Math.random() * color.length)]);
    model.addAttribute("fsize", fsize[(int) (Math.random() * fsize.length)]);
    model.addAttribute("ffamily", ffamily[(int) (Math.random() * ffamily.length)]);
    model.addAttribute("counter", manyTimes.getAndAdd(1));
    return "greeting";
  }
}
