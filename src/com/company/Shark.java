package com.company;

public class Shark extends Animal {

    @Override
    public void animalType() {
        System.out.println("Animal type: shark");
    }

    public void attack() {
        System.out.println("Shark can attack humans\n");
    }
}
