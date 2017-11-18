package com.thangphamspk.service;

import com.thangphamspk.entity.Drink;
import com.thangphamspk.entity.DrinkType;

import java.util.List;

public interface DrinkTypeService {

    DrinkType addType(DrinkType drinkType);

    List<DrinkType> getTypes();

    DrinkType getType(Integer id);

}
