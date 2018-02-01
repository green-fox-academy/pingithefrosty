package com.greenfox.pingithefrosty.pallidaexampractice.controllers;

import com.greenfox.pingithefrosty.pallidaexampractice.models.Cars;
import com.greenfox.pingithefrosty.pallidaexampractice.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarRestController {

  @Autowired
  CarService carService;

  @GetMapping("/api/search/{brand}")
  public Object showResultsWithJSON(@PathVariable String brand) {
    Cars cars = new Cars();
    if (brand == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } else {
      cars.setData(carService.lookUpBrand(brand));
      if (cars.getData() == null) {
        cars.setResult("not_ok");
      } else {
        cars.setResult("ok");
      }
    }
    return cars;
  }
}
