package com.company;

class Dog {

    String name;
    String color;
    int age;
    double tailLength;

    public void bark(){
        System.out.println("Bark");
    }
    public void eat(){
        System.out.println("Dog is eating!");
    }

    public void checkAge(){
        if(age > 15){
            System.out.println("SMS - your dog is old, go to vet now!");
        }
    }
    public String toString(){
        return ("Dog: " + name + ", color: " + color + ", age: " + age + ", tailLength: " + tailLength);
    }
}