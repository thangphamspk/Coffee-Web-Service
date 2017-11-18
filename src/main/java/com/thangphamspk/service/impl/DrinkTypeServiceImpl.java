package com.thangphamspk.service.impl;

import com.thangphamspk.entity.Drink;
import com.thangphamspk.entity.DrinkType;
import com.thangphamspk.repository.DrinkTypeRepository;
import com.thangphamspk.service.DrinkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkTypeServiceImpl implements DrinkTypeService {

    @Autowired
    private DrinkTypeRepository drinkTypeRepository;

    public DrinkTypeServiceImpl() {
    }

    public DrinkTypeRepository getDrinkTypeRepository() {
        return drinkTypeRepository;
    }

    public void setDrinkTypeRepository(DrinkTypeRepository drinkTypeRepository) {
        this.drinkTypeRepository = drinkTypeRepository;
    }

    @Override
    public DrinkType addType(DrinkType drinkType) {
        return drinkTypeRepository.save(drinkType);
    }

    @Override
    public List<DrinkType> getTypes() {
        return drinkTypeRepository.findAll();
    }

    @Override
    public DrinkType getType(Integer id) {
        return drinkTypeRepository.findOne(id);
    }

}
