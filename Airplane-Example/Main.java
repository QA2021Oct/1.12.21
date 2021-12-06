package com.company;

import java.util.Scanner;

public class Main {
    // create class - Airplane with properties:
    // flight , destination, speed, distance.
    // add Ctor (constructor) that gets all properties.
    // add one function to the class that prints the flight details
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        //1:
        Airplane airBus = new Airplane(5325 , "TLV", 420, 3200 );
        // 2:
        Airplane airBus2 = new Airplane(888 , "BUD", 420, 3200 );
        //3:
        Airplane airBus3 = new Airplane(7891 , "NYC", 420, 3200 );
        //4:
        Airplane airBus4 = new Airplane(523 , "PAR", 420, 3200 );
        //5:
        Airplane airBus5 = new Airplane(110 , "TLV", 420, 3200 );

        airBus.fly();
        airBus.fly();

        System.out.println(airBus);

    }
}
