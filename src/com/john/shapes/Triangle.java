package com.john.shapes;

import java.util.Scanner;

public class Triangle extends Tetrahedron{

    private Scanner sc;

    public Triangle() {
        sc=new Scanner(System.in);
        prompt(sc);
    }
    @Override
    public void prompt(Scanner scanner) {
        System.out.println("enter the length");
        setLength(scanner.nextInt());
        System.out.println("enter the height");
        setHeight(scanner.nextInt());
        System.out.println("Area is:" + calculateArea());
    }

    @Override
    public int calculateArea() {
        return (int) (0.5* getLength()*getWidth());
    }

    @Override
    public int calculatePerimeter() {
        return 0;
    }

}
