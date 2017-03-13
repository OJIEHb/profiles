package com.geiko.carParts;

import com.geiko.carParts.Engine;
import com.geiko.carParts.Wheel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Андрей on 09.03.2017.
 */
@Component
public class Car {
    @Autowired
    private Engine engine;
    @Autowired
    private Wheel wheel;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }
}
