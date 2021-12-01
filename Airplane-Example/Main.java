package com.company;

import java.util.Scanner;

public class Main {
    // create class - Airplane with properties:
    // flight , destination, speed, distance.
    // add Ctor (constructor) that gets all properties.
    // add one function to the class that prints the flight details
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Airplane airBus = new Airplane(5325 , "TLV", 420, 3200 );
        System.out.println(airBus);

    }
}
