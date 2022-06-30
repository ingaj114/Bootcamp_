package com.company.day3;

public class Main {

    public static void main(String[] args) {

        Vehicle bmw = new Vehicle();
        bmw.steering(true);
        bmw.steering(false);
        bmw.driveOn();
        bmw.driveOn();
        bmw.driveOn();
        bmw.driveOff();
        bmw.changeGearUp();
        bmw.changeGearUp();
        bmw.changeGearDown();


    }
}
