package com.company;

import java.util.Scanner;

public class Main {
    // create class - Airplane with properties:
    // flight , destination, speed, distance.
    // add Ctor (constructor) that gets all properties.
    // add one function to the class that prints the flight details 
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Dog dog1 = new Dog("Mika", "black", 6, 0.10);

        Dog dog2 = new Dog();
        System.out.println(dog1);

        /* don't need it noe-
        dog1.name = "Mika";
        dog1.color = "black";
        dog1.age = 6;
        dog1.tailLength = 0.10;*/

    }
}
