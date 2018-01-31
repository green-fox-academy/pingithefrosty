package com.greenfox.pingithefrosty.pallidaretake.services;

import com.greenfox.pingithefrosty.pallidaretake.models.Clothing;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClothingService {
  Clothing getClothingByName(String name);
  List<Clothing> findAll();
  List<String> findAllNames();
  List<String> findAllSizes();
  List<Clothing> findByPrice(double price, String type);
}
