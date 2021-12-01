package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dog bobi = new Dog();
        Dog charlie = new Dog();
        Cat catti = new Cat();

        bobi.name = "bobi";
        bobi.age = 3;
        bobi.color = "black";
        bobi.tailLength = 0.5;

        charlie.name = "charlie";
        charlie.age = 18;
        charlie.color = "black";
        charlie.tailLength = 0.2;

        catti.name = "catti";
        catti.age = 17;
        catti.souls = 6;
        catti.color = "yellow";
        catti.tailLength = 0.33;

        System.out.println(bobi.toString());
        System.out.println(charlie);
        System.out.println(catti);

        bobi.checkAge();
        charlie.checkAge();

    }

}
