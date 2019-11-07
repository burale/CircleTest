package com.liibaan.cicleTest.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CircleServiceTest {

    @Autowired
    private CircleService circleService;

    @Test
    @DisplayName("Testing if correct circle is created when radius is given")
    public void getAreaTest(){
        assertEquals(9, circleService.getArea(2));
    }
}