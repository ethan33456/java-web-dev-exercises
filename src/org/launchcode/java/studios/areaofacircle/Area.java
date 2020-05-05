package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float radius;
        do{
            System.out.println("Radius of Circle:");
            radius = input.nextFloat();
        } while (radius < 0);


        double area = Circle.getArea((double) radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
