package com.thangphamspk.controller;

import com.thangphamspk.entity.CoffeeTable;
import com.thangphamspk.exception.ObjectNotFoundException;
import com.thangphamspk.service.CoffeeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CoffeeTableController {

    @Autowired
    private CoffeeTableService coffeeTableService;

    @GetMapping("/tables")
    public List<CoffeeTable> getTables() {
        return coffeeTableService.getTables();
    }

    @GetMapping("/tables/{id}")
    public CoffeeTable getTable(@PathVariable Integer id) {
        CoffeeTable table = coffeeTableService.getTable(id);
        if (table == null) {
            throw new ObjectNotFoundException("Could not find Table with id: " + id);
        }
        return table;
    }

    @PostMapping("/tables")
    public CoffeeTable createTable(@Valid @RequestBody CoffeeTable coffeeTable) {
        return coffeeTableService.addTable(coffeeTable);
    }
}
