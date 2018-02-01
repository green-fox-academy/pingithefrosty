package com.greenfox.pingithefrosty.pallidaexampractice.repositories;

import com.greenfox.pingithefrosty.pallidaexampractice.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, String> {

  List<Car> findAllByPlateStartingWith(String input);
  List<Car> findAllByBrand(String input);
  List<Car> findAllByPlateContains(String input);
}
