package com.epam.java_basics.ht_2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double circumference, area;
        double radius = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a radius");

        if (sc.hasNextDouble()) {
            radius = sc.nextDouble();
        } else if (!sc.hasNextDouble()) {
            throw new RuntimeException("Invalid value of the radius has been entered.");
        }

        if (radius < 0) {
            throw new RuntimeException("The negative radius has been entered.");
        } else {
            circumference = 2 * Math.PI * radius;
            area = Math.PI * Math.pow(radius, 2);
            System.out.println("The calculated value of circumference is " + Math.floor(circumference) + ", area is " + Math.floor(area));
        }
    }
}
