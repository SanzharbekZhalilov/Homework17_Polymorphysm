package com.company;

public class Main {
    public static void main(String[] args) {

        Animal[] animal = {new Shark(),
                new Turtle(),
                new Eagle()};

        for (Animal i : animal) {
            if(i instanceof Shark) { // instanceof
                i.animalType();
                ((Shark) i).attack();
            }
            if(i instanceof Turtle) { // instanceof
                i.animalType();
                ((Turtle) i).swim();
            }
            if(i.getClass().getName().equals("com.company.Eagle")) { // getClass()
                i.animalType();
                ((Eagle) i).fly();
            }
        }

        // Ар бир объект учун оз озунчо массив тузуп, Animal массивиндеги жаныбарларды болуп оз озунун массивине салуу
        Shark[] sharks = {new Shark()};
        Turtle[] turtles = {new Turtle()};
        Eagle[] eagles = {new Eagle()};

    }
}