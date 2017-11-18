package com.thangphamspk.controller;

import com.thangphamspk.entity.DrinkType;
import com.thangphamspk.exception.ObjectNotFoundException;
import com.thangphamspk.service.DrinkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DrinkTypeController {

    @Autowired
    private DrinkTypeService drinkTypeService;

    @GetMapping("/types")
    public List<DrinkType> getTypes() {
        return drinkTypeService.getTypes();
    }

    @GetMapping("/types/{id}")
    public DrinkType getType(@PathVariable Integer id) {
        DrinkType drinkType = drinkTypeService.getType(id);
        if (drinkType == null) {
            throw new ObjectNotFoundException("Could not find DrinkType with id: " + id);
        }
        return drinkType;
    }

    @PostMapping("/types")
    public DrinkType addType(@Valid @RequestBody DrinkType drinkType) {
        return drinkTypeService.addType(drinkType);
    }
}
