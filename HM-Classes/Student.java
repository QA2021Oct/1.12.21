package com.company;

public class Student {
    String name;
    int roll_no;

    public void sayHey(){
        System.out.println(name + " say hey");
    }

    public String toString(){
        return "Student name: " + name + ", roll_no: " + roll_no;
    }

}
