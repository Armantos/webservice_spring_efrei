package com.efrei.webservice_spring_efrei.repository;

import com.efrei.webservice_spring_efrei.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    //all crud database methods
}
