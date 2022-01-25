package com.efrei.webservice_spring_efrei.repository;

import com.efrei.webservice_spring_efrei.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Integer> {
}
