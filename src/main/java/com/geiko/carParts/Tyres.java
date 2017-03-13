package com.geiko.carParts;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.Map;

/**
 * Created by Андрей on 09.03.2017.
 */
@ConfigurationProperties(prefix = "car.wheel.tyres")
public class Tyres {
    private String name;
    private Integer size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tyres{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
