package com.geiko.carParts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Андрей on 09.03.2017.
 */
@Component
public class Wheel {
    @Autowired
    Tyres tyres;

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "tyres=" + tyres +
                '}';
    }
}
