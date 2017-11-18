package com.thangphamspk.repository;

import com.thangphamspk.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrinkRepository extends JpaRepository<Drink,Integer> {
    List<Drink> getAllByDrinkTypeId(Integer id);
}
