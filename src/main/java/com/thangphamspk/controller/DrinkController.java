package com.thangphamspk.controller;

import com.thangphamspk.entity.Drink;
import com.thangphamspk.exception.ObjectNotFoundException;
import com.thangphamspk.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DrinkController {

    @Autowired
    private DrinkService drinkService;

    @GetMapping("/drinks")
    public List<Drink> getDrinks() {
        return drinkService.getDrinks();
    }

    @GetMapping("drinks/{id}")
    public Drink getDrink(@PathVariable Integer id) {
        Drink drink = drinkService.getDrink(id);
        if (drink == null) {
            throw new ObjectNotFoundException("Could not find Drink with id: " + id);
        }
        return drink;
    }


    @GetMapping("types/{id}/drinks")
    public List<Drink> getAllByDrinkTypeId(@PathVariable Integer id) {
        List<Drink> drinks = drinkService.getAllByDrinkTypeId(id);
        if (drinks == null) {
            throw new ObjectNotFoundException("Could not find Drink with type_id: " + id);
        }
        return drinks;
    }

    @PostMapping("/drinks")
    public Drink addDrink(@Valid @RequestBody Drink drink) {
        return drinkService.addDrink(drink);
    }

}
