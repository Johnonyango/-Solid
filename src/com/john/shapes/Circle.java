package com.john.shapes;

import java.util.Scanner;

public class Circle extends  Shape{
    private final int PI = (int)3.142;
    @Override
    public void prompt(Scanner scanner) {
        System.out.println("enter the radius");
        setRadius(scanner.nextInt());
        System.out.println("Area is:"+ calculateArea());
        System.out.println("Perimeter is:"+ calculatePerimeter());
    }

    @Override
    public int calculateArea() {
        return PI*getRadius()*getRadius();
    }

    @Override
    public int calculatePerimeter() {
        return 2*PI*getRadius();
    }
}
