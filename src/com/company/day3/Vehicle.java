package com.company.day3;

public class Vehicle {

    // Create a base class of a Vehicle,
    // then create a Car class which inherits from the Vehicle class.
    // Also, create another class, a specific type of Car that inherits from the Car class.
    // Program should be able to handle steering, changing gears, and drive (having speed in other words).
    // You might decide where to put the appropriate state and behaviors (fields and methods).
    // As mentioned above, changing gears, increasing/decreasing speed of driving should be included.

    int speed = 0;
    int gear = 0;

    public void steering() {
        System.out.println("The steering is on!");
    }
    public void changeGearUp() {
        if (gear >= 6) {
            System.out.println("You are in gear 6 already");
        } else gear++;

        System.out.println("You are in gear" + gear);
    }

    public void changeGearDown() {
        if (gear == 0) {
            System.out.println("The gear is already 0");
        } else if (gear == 1) {
            System.out.println("You have first gear already");
        } else  gear--;
        System.out.println("You are in gear" + gear);
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
