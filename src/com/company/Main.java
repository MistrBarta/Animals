package com.company;

import java.io.PrintStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Animal dog = new Animal("Mikes", 1, AnimalType.DOG);
        Animal cat = new Animal("Hovorka", 2, AnimalType.CAT);
        Animal bird = new Animal("Viglas", 3, AnimalType.BIRD);
        PrintStream var10000 = System.out;
        String var10001 = dog.getName();
        var10000.println("Pes: Jméno psa: " + var10001 + ", věk psa: " + dog.getAge() + ",typ zvirete: " + dog.getType());
        var10000 = System.out;
        var10001 = cat.getName();
        var10000.println("Kočka: Jméno kocky: " + var10001 + ", věk kocky: " + cat.getAge() + ",typ zvirete: " + cat.getType());
        var10000 = System.out;
        var10001 = bird.getName();
        var10000.println("Pták: Jméno ptaka: " + var10001 + ", věk ptaka: " + bird.getAge() + ",typ zvirete: " + bird.getType());
    }
}