package com.john.shapes;

import java.util.Scanner;

public class Ellipse extends Shape {
    private final int PI = (int)3.142;
    int majorRadius;
    int minorRadius;

    @Override
    public void prompt(Scanner scanner) {
        System.out.println("enter the length");
        setLength(scanner.nextInt());
        System.out.println("Area is:"+ calculateArea());
        System.out.println("Perimeter is:"+ calculatePerimeter());
    }

    @Override
    public int calculateArea() {
        return 0;
    }

    @Override
    public int calculatePerimeter() {
        return 0;
    }
}
