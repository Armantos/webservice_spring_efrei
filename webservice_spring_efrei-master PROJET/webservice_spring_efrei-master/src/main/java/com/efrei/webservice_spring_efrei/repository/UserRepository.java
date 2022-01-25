package com.efrei.webservice_spring_efrei.repository;

import com.efrei.webservice_spring_efrei.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUsernameAndPassword(String Username, String Password);

}
