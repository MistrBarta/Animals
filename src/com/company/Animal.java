package com.company;

public class Animal {
    private String name;
    private int age;
    private AnimalType type;

    public Animal(String name, int age, AnimalType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public AnimalType getType() {
        return this.type;
    }

    public String toString() {
        return "Animal{name='" + this.name + "', age=" + this.age + ", type=" + this.type + "}";
    }
}
