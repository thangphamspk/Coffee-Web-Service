package com.thangphamspk.service.impl;

import com.thangphamspk.entity.CoffeeTable;
import com.thangphamspk.repository.CoffeeTableRepository;
import com.thangphamspk.service.CoffeeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeTableServiceImpl implements CoffeeTableService {

    @Autowired
    private CoffeeTableRepository coffeeTableRepository;

    @Override
    public CoffeeTable addTable(CoffeeTable coffeeTable) {
        return coffeeTableRepository.save(coffeeTable);
    }

    @Override
    public List<CoffeeTable> getTables() {
        return coffeeTableRepository.findAll();
    }

    @Override
    public CoffeeTable getTable(Integer id) {
        return coffeeTableRepository.findOne(id);
    }
}
