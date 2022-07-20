package com.company;

public class Eagle extends Animal {

    @Override
    public void animalType() {
        System.out.println("Animal type: eagle");
    }

    public void fly() {
        System.out.println("Eagle can fly\n");
    }
}
