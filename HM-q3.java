package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    //Create function name- printGeneralMsg() –
    // thae function get name, last name and year of birth.
    // And return the massage - "hello [Name] [last name] you are [age] years old".  // current year - 1990 = age
    // Call function from main and get the values from user (using Scanner).
    // Call function from main and send it the parameters from user.
    // Hint: - use int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);
    // to calculate the current age from year of birth.

    public static void main(String[] args) {
        String outPut = printGeneralMsg("Dan", "Israeli", 1960);
        System.out.println(outPut);
    }
    public  static String printGeneralMsg(String name, String lastName, int yearOfBirth){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        String result = String.format("hello %s %s you are %d years old", name, lastName, currentYear- yearOfBirth );
        return result;
    }

}
