package com.epam.java_basics.ht_2;

import java.util.Scanner;

public class Formula {

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        double result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter \'a\' variable as a real number");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        } else if (!sc.hasNextDouble()) {
            throw new RuntimeException("Input variable \'a\' is not a real number");
        }

        System.out.println("Enter \'b\' variable as a real number");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        } else if (!sc.hasNextDouble()) {
            throw new RuntimeException("Input variable \'b\' is not a real number");
        }

        System.out.println("Enter \'c\' variable as a real number");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        } else if (!sc.hasNextDouble()) {
            throw new RuntimeException("Input variable \'c\' is not a real number");
        }

        result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + b;
        System.out.println("The result of your calculations is " + Math.round(result));
    }
}
