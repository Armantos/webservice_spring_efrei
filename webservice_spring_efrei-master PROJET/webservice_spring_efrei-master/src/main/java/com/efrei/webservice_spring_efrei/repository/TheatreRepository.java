package com.efrei.webservice_spring_efrei.repository;

import com.efrei.webservice_spring_efrei.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
}
