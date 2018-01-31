package com.greenfox.pingithefrosty.pallidaretake.services;

import com.greenfox.pingithefrosty.pallidaretake.models.Clothing;
import com.greenfox.pingithefrosty.pallidaretake.repositories.ClothingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothingServiceImpl implements ClothingService {

  @Autowired
  ClothingRepository clothingRepository;

  @Override
  public Clothing getClothingByName(String name) {
    return clothingRepository.findOneDistinct(name);
  }

  @Override
  public List<Clothing> findAll() {
    return clothingRepository.findAll();
  }

  @Override
  public List<String> findAllNames() {
    return clothingRepository.findDistinctNames();
  }

  @Override
  public List<String> findAllSizes() {
    return clothingRepository.findDistinctSizes();
  }

  @Override
  public List<Clothing> findByPrice(double price, String type) {
    if (type.equals("higher")) {
      return clothingRepository.findByPriceIsGreaterThan(price);
    } else if (type.equals("lower")) {
      return clothingRepository.findByPriceIsLessThan(price);
    } else if (type.equals("equal")) {
      return clothingRepository.findByPriceEquals(price);
    } else {
      return null;
    }
  }
}
