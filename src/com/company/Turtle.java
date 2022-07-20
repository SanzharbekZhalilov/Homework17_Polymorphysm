package com.company;

public class Turtle extends Animal {

    @Override
    public void animalType() {
        System.out.println("Animal type: turtle");
    }

    public void swim() {
        System.out.println("Turtle can swim\n");
    }
}
