package com.greenfox.pingithefrosty.pallidaretake.controllers;

import com.greenfox.pingithefrosty.pallidaretake.models.Clothes;
import com.greenfox.pingithefrosty.pallidaretake.services.ClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClothingRestController {

  @Autowired
  ClothingService clothingService;

  @GetMapping("/warehouse/query")
  public Object showResultsWithJSON(@RequestParam(value = "price", required = false) String price,
                                    @RequestParam(value = "type", required = false) String type) {
    Clothes clothes = new Clothes();
    if (price != null && type != null) {
      clothes.setClothes(clothingService.findByPrice(Double.valueOf(price), type));
    } else {
      clothes.setClothes(null);
      clothes.setResult("not ok");
    }
    return clothes;
  }
}