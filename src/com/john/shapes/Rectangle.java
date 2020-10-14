package com.john.shapes;

import com.john.shapes.Shape;

import java.util.Scanner;

public class Rectangle extends Shape {
    private Scanner sc;

    public Rectangle() {
        sc=new Scanner(System.in);
        prompt(sc);
    }

    @Override
    public void prompt(Scanner scanner) {
        System.out.println("enter the length");
        setLength(scanner.nextInt());
        System.out.println("enter the width");
        setWidth(scanner.nextInt());

        System.out.println("Area is:" + calculateArea() + '\n' + "Perimeter is:" +calculatePerimeter());

    }

    @Override
    public int calculateArea() {
        return getLength() * getWidth();
    }

    @Override
    public int calculatePerimeter() {
        return 2 *(getLength() + getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sc=" + sc +
                '}';
    }
}
