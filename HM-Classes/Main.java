package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    // 4. Create a class named 'Student' with:
    // • String variable 'name'
    // • integer variable 'roll_no'.
    // • etgar: Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
    // – צור מופע מהמחלקה והכנס לתוכו את הערכים: roll_no = 2,
    // Name = "John"

    // 5: create a class named 'Average' having a method to calculate and print the average.
    // etgar: Print the average of three numbers entered by user using that class.
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        // 4:
        Student john  = new Student();
        john.name = "John";
        john.roll_no = 2;

        Student ari = new Student();
        ari.name = "Ari";
        ari.roll_no = 7;

        System.out.println(john);
        System.out.println(ari);

        john.sayHey();
        ari.sayHey();

        // 5:
        Average a = new Average();
        float avg1 = a.printAvg(8, 6, 2);
        System.out.println(avg1);

        System.out.println( a.printAvg( 10, 20, 30) );
        System.out.println("Enter tree numbers please: ");
        float x = s.nextFloat();
        float y = s.nextFloat();
        float z = s.nextFloat();

        // with Sout inside Main:
        System.out.println( a.printAvg(x, y, z)  );

        // with Sout inside function- printAvgWithoutReturn - inside  class Average:
        a.printAvgWithoutReturn(50.1f, 25.12f, 20.98f);

    }
}
