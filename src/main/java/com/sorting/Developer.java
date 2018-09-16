package com.sorting;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Developer {

    private String name;
    private BigDecimal salary;
    private int age;

    public Developer(String name, BigDecimal salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    
}
