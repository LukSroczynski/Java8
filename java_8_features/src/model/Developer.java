package model;

import java.math.BigDecimal;

/**
 * Created by Surrealistic on 13/07/2017.
 */
public class Developer implements Humanoid {

    private String name;

    private BigDecimal salary;

    private int age;

    public Developer(String name, BigDecimal salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
