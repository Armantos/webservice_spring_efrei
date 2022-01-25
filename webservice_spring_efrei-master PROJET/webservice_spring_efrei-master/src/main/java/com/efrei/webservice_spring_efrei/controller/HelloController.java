package com.efrei.webservice_spring_efrei.controller;

import com.efrei.webservice_spring_efrei.model.Movie;
import com.efrei.webservice_spring_efrei.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class HelloController {

    @Autowired
    MovieRepository movieRepository;


    @GetMapping("/hello")
    public ModelAndView getAllMovies() {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("movies", movieRepository.findAll());
        return mav;
    }
}
