package com.efrei.webservice_spring_efrei.repository;

import com.efrei.webservice_spring_efrei.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
