package com.company;

public class Airplane {

       int flight;
    String destination;
    double speed;
    double distance;

    // ALT + INSERT
    public  Airplane(){

    }

    public Airplane(int flight, String destination) {
        this.flight = flight;
        this.destination = destination;
    }

    public Airplane(int flight, String destination, double speed, double distance) {
        this.flight = flight;
        this.destination = destination;
        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public String toString(){
        return "flight = " + flight + "\n" +
                "destination = " + destination +"\n" +
                "speed = " + speed + "\n" +
                "distance = " +distance ;
    }

    public void fly(){
        System.out.println("fly...");
    }

    public void fly(int a){
        System.out.println("fly...");
    }
}
