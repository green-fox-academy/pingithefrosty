package com.greenfox.pingithefrosty.pallidaretake.controllers;

import com.greenfox.pingithefrosty.pallidaretake.models.Clothing;
import com.greenfox.pingithefrosty.pallidaretake.models.ProductData;
import com.greenfox.pingithefrosty.pallidaretake.services.ClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClothingController {

  @Autowired
  ClothingService clothingService;

  @ExceptionHandler(Exception.class)
  public ResponseEntity<String> exceptionHandling() {
    return ResponseEntity.badRequest().body("Error");
  }

  @GetMapping("/warehouse")
  public String listOfClothes(Model model, @ModelAttribute ProductData productData) {
    List<Clothing> clothingList = clothingService.findAll();
    List<String> clothingNames = clothingService.findAllNames();
    List<String> clothingSizes = clothingService.findAllSizes();
    model.addAttribute("clothingNames", clothingNames);
    model.addAttribute("clothingSizes", clothingSizes);
    model.addAttribute("clothing", clothingList);
    model.addAttribute("newClothing", new ProductData());
    return "warehouse";
  }

  @PostMapping("/warehouse/summary")
  public String summaryOfProduct(@ModelAttribute ProductData productData, Model model) {
    Clothing clothing = clothingService.getClothingByName(productData.getName());
    productData.setManufacturer(clothing.getManufacturer());
    productData.setCategory(clothing.getCategory());
    productData.setPrice(clothing.getPrice());
    model.addAttribute("name", productData.getName());
    model.addAttribute("manufacturer", productData.getManufacturer());
    model.addAttribute("category", productData.getCategory());
    model.addAttribute("size", productData.getSize());
    model.addAttribute("quantity", productData.getQuantity());
    model.addAttribute("subTotal", productData.getPrice() * productData.getQuantity());
    return "summary";
  }
}
