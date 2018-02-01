package com.greenfox.pingithefrosty.pallidaexampractice.services;

import com.greenfox.pingithefrosty.pallidaexampractice.models.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {
  List<Car> getCarByLicencePlate(String plate, int police, int diplomat);
  List<Car> lookUpBrand(String brand);
  boolean plateValidator(String plate);
}
