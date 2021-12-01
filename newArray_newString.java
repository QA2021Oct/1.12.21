package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dog dog1 = new Dog();

        // int x = new int;  // primitive

        String str = new String(); // reference

        int array [] = {0, 0 , 0, 0};
        int array1 [] = new int[10];

        //initialize:
        for(int i = 0; i < array1.length; i++){
            array1[i] = i * 2;
        }

        // print array:
        for(int i=0; i < array1.length; i++){
            System.out.println(array1[i]);
        }

    }

}
