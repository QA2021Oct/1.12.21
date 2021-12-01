package com.company;

public class Cat {

    String name;
    String color;
    int age;
    double tailLength;
    int souls;

    public void MakeAsound(){
        System.out.println("Miaooo");
    }
    public void eat(){
        System.out.println("Cat is eating!");
    }
    public String toString(){
        return ("Cat: " + name + ", color: " + color + ", age: " + age + ", tailLength: " + tailLength + ", souls: " + souls);
    }
}
