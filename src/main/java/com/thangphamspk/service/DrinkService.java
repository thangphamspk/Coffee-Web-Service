package com.thangphamspk.service;

import com.thangphamspk.entity.Drink;

import java.util.List;

public interface DrinkService {

    Drink addDrink(Drink drink);

    List<Drink> getDrinks();

    Drink getDrink(Integer id);

    List<Drink> getAllByDrinkTypeId(Integer id);

}
