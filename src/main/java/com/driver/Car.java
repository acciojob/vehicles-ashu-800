package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car(String name, int wheels, String type, int doors, int gears, boolean isManual, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
        this.seats = seats;
    }


    public void changeGear(int newGear){
            this.currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}

//Subtask 1: You are given the classes Vehicle, Car, and F1. Complete the driver code of each of these classes.
//        Subtask 2: You are given the interface WaterVehicle. Construct a new class Boat (with exactly the same and member variables as given below).
//        The details of the classes that constitute the project are:
//
//        Vehicle: name, currentSpeed, currentDirection
//
//        constructor: given the name of the vehicle, initialize speed and direction as 0.
//        move(speed, direction): set the current speed and direction
//        steer(direction): Add direction to the currentDirection
//        stop(): Stop the car by setting current speed to 0
//        Car: extends Vehicle
//
//        constructor: initialize the variables using parameters and set currentGear as 1.
//        changeGear(newGear): set the current gear to newGear parameter.
//        changeSpeed(newSpeed, newDirection): set the speed and direction using move().
//        F1: extends Car
//
//        accelerate(rate): add rate to the current speed and change the gear accordingly
//        Boat: implements WaterVehicle interface
//
//Has following member variables: a. name : of String type b. capacity : of int type
//        Return name and capacity in getVehicleName and getVehicleCapacity respectively.
//        Note:
//
//        Make sure that the class names are exactly the same.