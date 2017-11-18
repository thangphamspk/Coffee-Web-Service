package com.thangphamspk.service;

import com.thangphamspk.entity.CoffeeTable;

import java.util.List;

public interface CoffeeTableService {

    CoffeeTable addTable(CoffeeTable coffeeTable);

    List<CoffeeTable> getTables();

    CoffeeTable getTable(Integer id);
}
