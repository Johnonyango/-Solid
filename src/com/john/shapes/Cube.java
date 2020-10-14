package com.john.shapes;

import java.util.Scanner;

public class Cube extends Box {
    private Scanner sc;

    public Cube() {
        sc=new Scanner(System.in);
        prompt(sc);
    }
    @Override
    public void prompt(Scanner scanner) {
        System.out.println("enter the length");
        setLength(scanner.nextInt());
        System.out.println("enter the width");
        setWidth(scanner.nextInt());
        System.out.println("enter the height");
        setHeight(scanner.nextInt());
        System.out.println("Area is:"+calculateArea());
    }

    @Override
    public int calculateArea() {
        return getLength() * getWidth() *getHeight();
    }

    @Override
    public int calculatePerimeter() {
        return super.calculatePerimeter();
    }
}
