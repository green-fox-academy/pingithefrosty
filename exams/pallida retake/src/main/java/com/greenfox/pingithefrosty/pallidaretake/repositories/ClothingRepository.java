package com.greenfox.pingithefrosty.pallidaretake.repositories;

import com.greenfox.pingithefrosty.pallidaretake.models.Clothing;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClothingRepository extends CrudRepository<Clothing, String> {

  @Query(value = "SELECT DISTINCT name FROM clothing.warehouse", nativeQuery = true)
  List<String> findDistinctNames();
  @Query(value = "SELECT DISTINCT size FROM clothing.warehouse", nativeQuery = true)
  List<String> findDistinctSizes();
  @Query(value = "SELECT DISTINCT * FROM clothing.warehouse WHERE name = :input GROUP BY name", nativeQuery = true)
  Clothing findOneDistinct(@Param("input") String input);
  List<Clothing> findAll();
  List<Clothing> findByPriceIsGreaterThan(double price);
  List<Clothing> findByPriceIsLessThan(double price);
  List<Clothing> findByPriceEquals(double price);
}
