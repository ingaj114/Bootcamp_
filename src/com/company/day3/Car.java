package com.company.day3;

public class Car extends Vehicle {

    public void steering() {
        System.out.println("The steering is on!");
    }
    public void changeGearUp() {
        gear++;
        System.out.println("You are in gear " + gear);
    }

    public void changeGearDown() {
        gear--;
        System.out.println("You are in gear " + gear);
    }

    public void driveOn() {
        speed++;
        System.out.println("Your speed is " + speed);
    }
    public void driveOff() {
        speed--;
        System.out.println("Your speed is " + speed);
    }
}
