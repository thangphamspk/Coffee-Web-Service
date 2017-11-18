package com.thangphamspk.repository;

import com.thangphamspk.entity.DrinkType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface DrinkTypeRepository extends JpaRepository<DrinkType, Integer> {

}
