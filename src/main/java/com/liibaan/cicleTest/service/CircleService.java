package com.liibaan.cicleTest.service;

import org.springframework.stereotype.Service;

@Service
public class CircleService {

    public double getArea(int radius){
        return radius * 2;
    }
}
