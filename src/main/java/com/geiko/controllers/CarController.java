package com.geiko.controllers;

import com.geiko.carParts.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Андрей on 09.03.2017.
 */
@RestController
public class CarController {
    @Autowired
    Car car;

    @RequestMapping("/")
    public String index() {
        return car.toString();
    }

}