package com.greenfox.pingithefrosty.pallidaexampractice.services;

import com.greenfox.pingithefrosty.pallidaexampractice.models.Car;
import com.greenfox.pingithefrosty.pallidaexampractice.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class CarServiceImpl implements CarService {

  @Autowired
  CarRepository carRepository;

  @Override
  public List<Car> lookUpBrand(String brand) {
    return carRepository.findAllByBrand(brand);
  }

  @Override
  public List<Car> getCarByLicencePlate(String plate, int police, int diplomat) {
    if (police == 0 && diplomat == 0 && plate.equals("")) {
      return (List<Car>) carRepository.findAll();
    } else if (police == 1) {
      return carRepository.findAllByPlateStartingWith("RB");
    } else if (diplomat == 1) {
      return carRepository.findAllByPlateStartingWith("DT");
    } else {
      return carRepository.findAllByPlateContains(plate);
    }
  }

  @Override
  public boolean plateValidator(String plate) {
    return plate.length() <= 7 && Pattern.compile("[a-zA-Z0-9-]*").matcher(plate).matches();
/*    ArrayList<Character> validCharacters = new ArrayList<>(Arrays.asList('-','0', '1', '2', '3', '4', '5', '6',
        '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
        'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
    if (plate.length() <= 7 && carRepository.findAllByPlateContains(plate) != null) {
      for (int i = 0; i < plate.length(); i++) {
        if (!validCharacters.contains(plate.charAt(i))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }*/
  }
}
