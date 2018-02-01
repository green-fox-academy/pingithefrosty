package com.greenfox.pingithefrosty.pallidaexampractice.controllers;

import com.greenfox.pingithefrosty.pallidaexampractice.models.Car;
import com.greenfox.pingithefrosty.pallidaexampractice.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

  @Autowired
  CarService carService;

  @GetMapping("/search")
  public String showResults(@RequestParam(value = "q", required = false, defaultValue = "") String q,
                            @RequestParam(value = "police", required = false, defaultValue = "0") int police,
                            @RequestParam(value = "diplomat", required = false, defaultValue = "0") int diplomat, Model model) {
    if (carService.plateValidator(q) || police == 1 || diplomat == 1) {
      model.addAttribute("cars", carService.getCarByLicencePlate(q, police, diplomat));
      return "results";
    }
    model.addAttribute("error", "Sorry,the submitted licence plate is not valid");
    return "results";
  }

  @GetMapping("/search/{brand}")
  public String showResultsByBrand(@PathVariable String brand, Model model) {
    List<Car> cars = carService.lookUpBrand(brand);
    model.addAttribute("cars", cars);
    return "results";
  }
}
