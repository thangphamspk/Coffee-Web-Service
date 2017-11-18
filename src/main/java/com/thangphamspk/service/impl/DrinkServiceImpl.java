package com.thangphamspk.service.impl;

import com.thangphamspk.entity.Drink;
import com.thangphamspk.repository.DrinkRepository;
import com.thangphamspk.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkServiceImpl implements DrinkService {

    @Autowired
    private DrinkRepository drinkRepository;

    public DrinkServiceImpl() {
    }

    public DrinkRepository getDrinkRepository() {
        return drinkRepository;
    }

    public void setDrinkRepository(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    @Override
    public Drink addDrink(Drink drink) {
        return drinkRepository.save(drink);
    }

    @Override
    public List<Drink> getDrinks() {
        return drinkRepository.findAll();
    }

    @Override
    public Drink getDrink(Integer id) {
        return drinkRepository.findOne(id);
    }

    @Override
    public List<Drink> getAllByDrinkTypeId(Integer id) {
        return drinkRepository.getAllByDrinkTypeId(id);
    }
}
