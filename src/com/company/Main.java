// Denise Chen
// IS 147-04
// d189@umbc.edu
// 12/8/2021
// use interface and inheritance

package com.company;

public class Main {
    public static void main(String[] args) {
        Car bmwCar = new BMW();
        bmwCar.start();
        bmwCar.stop();

        System.out.println ("----------------------------");
        Car lexus = new Lexus();
        lexus.stop();
        lexus.stop();

        System.out.println ("----------------------------");
        Lexus lexus2 = new Lexus();
        lexus2.stop();
        lexus2.stop();
        lexus2.speed();
    }
}