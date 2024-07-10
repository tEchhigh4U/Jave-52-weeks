package com.william.src.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Animal {
    private int speed;
    private static int numberOfCellsInBrain;

    public int getSpeed(){
        return speed;
    }

    public void setBaseSpeed(int x){
        speed = x;
    }

    public static int getNumberOfCellsInBrain(){
        return numberOfCellsInBrain;
    }

    public static void setNumberOfCellsInBrain(int x){
        numberOfCellsInBrain = x;
    }


}

class Dog extends Animal {
    private final List<String> ownerList;

    Dog(List<String> initialOwners) {
        ownerList = new ArrayList<>(initialOwners);
    }

    public void setSpeed(int x) {
        if (x >= -10 && x <= 40) {
            setBaseSpeed(x);
        } else {
            System.out.println("The speed is out of range.");
        }
    }

    public void addOwner(String newOwner){
        ownerList.add(newOwner);
    }

    public void getOwner(){
        for (int x = 0; x < ownerList.size(); x++){
            System.out.println(ownerList.get(x));
        }
    }
}

class Cat extends Animal {
    private final List<String> ownerList;

    Cat(List<String> initialOwners) {
        ownerList = new ArrayList<>(initialOwners);
    }

    public void setSpeed(int x) {
        if (x >= 0 && x <= 20) {
            setBaseSpeed(x);
        } else {
            System.out.println("The speed is out of range.");
        }
    }

    public void addOwner(String newOwner){
        ownerList.add(newOwner);
    }

    public void getOwner(){
        for (int x = 0; x < ownerList.size(); x++){
            System.out.println(ownerList.get(x));
        }
    }
}

public class staticDemo {
    public static void main(String[] args) {
        List<String> dogOwners = Arrays.asList("Alice", "Bob");
        List<String> catOwners = Arrays.asList("Charlie", "Dana");

        Dog myDog = new Dog(dogOwners);
        Cat myCat = new Cat(catOwners);

        myDog.setSpeed(40);
        myCat.setSpeed(-10); // set an invalid speed for myCat
        Animal.setNumberOfCellsInBrain(1);

        myDog.addOwner("Peter");
        myCat.addOwner("Cherry");

        // Print owners
        System.out.println("Dog owners:");
        myDog.getOwner();
        System.out.println(); //line breaker
        System.out.println("Cat owners:");
        myCat.getOwner();

        System.out.println(); //line breaker
        System.out.println("Dog speed: " + myDog.getSpeed());
        System.out.println("Cat speed: " + myCat.getSpeed());
        System.out.println("Dog's number of brains: " + Dog.getNumberOfCellsInBrain());
        System.out.println("Cat's number of brains: " +Cat.getNumberOfCellsInBrain());
    }
}
