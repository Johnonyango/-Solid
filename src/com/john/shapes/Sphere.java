package com.john.shapes;

import java.util.Scanner;

public class Sphere extends Ellipse {
    private final int PI = (int) 3.142;

    private Scanner sc;

    public Sphere() {
        sc=new Scanner(System.in);
        prompt(sc);
    }
    @Override
    public void prompt(Scanner scanner) {
        System.out.println("radius");
        setRadius(scanner.nextInt());

        System.out.println("Area is:" + calculateArea() + '\n' + "Perimeter is:" +calculatePerimeter());
    }

    @Override
    public int calculateArea() {
        return 4*PI *getRadius()*getRadius();
    }

    @Override
    public int calculatePerimeter() {
        return (int) (0.75*PI*getRadius()*getRadius()*getRadius());
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "PI=" + PI +
                ", sc=" + sc +
                '}';
    }
}
