package com.william.src.week5;

abstract class Animal{
    public int age;
    public int weight;
}

abstract class Land extends Animal{
    public int noOfLeg;
}
class Fish extends Animal{
    public int speed;
}

class  Whale extends Fish{
    public int noOfFin;
}

class Cat extends Land{
    public String color;
}

public class ClassAssignment2 {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.age = 2;
        fish.weight = 5;
        fish.speed = 3;
        System.out.println( "1. The " + fish.age + " year-old fish is " + fish.weight +
                                "kg. Pretty heavy! But he can swim at a speed of "
                                + fish.speed + " km/h on average.");

        System.out.println();

        Whale whale = new Whale();
        whale.weight = 5;
        whale.noOfFin = 2;
        System.out.println( "2. The Whale of " + whale.weight + " tons has " + whale.noOfFin +
                            " fins that power him to swim for a long distance.");

        System.out.println();

        Cat cat = new Cat();
        cat.noOfLeg = 4;
        cat.color = "white";
        cat.age = 5;
        cat.weight = 8;
        System.out.println("3. The " + fish.age + " year-old " + cat.color + " cat has "
                            + cat.noOfLeg + " legs, which is now " + cat.weight + " kg.");
    }


}




