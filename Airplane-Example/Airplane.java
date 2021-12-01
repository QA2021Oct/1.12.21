package com.company;

public class Airplane {

    int flight;
    String destination;
    double speed;
    double distance;

    // ALT + INSERT
    public Airplane(int flight, String destination, double speed, double distance) {
        this.flight = flight;
        this.destination = destination;
        this.speed = speed;
        this.distance = distance;
    }

    public String toString(){
        return "flight = " + flight + "\n" +
                "destination = " + destination +"\n" +
                "speed = " + speed + "\n" +
                "distance = " +distance ;
    }
}
