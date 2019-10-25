package com.liibaan.cicleTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircleController {
    @RequestMapping("/circle/all")
    public String showAll(){
        return "GETTING THERE";
    }
}
