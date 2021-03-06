package com.john.shapes;

import java.util.Scanner;

public class Square extends Cube{

    private Scanner sc;

    public Square() {
        sc=new Scanner(System.in);
        prompt(sc);
    }
    @Override
    public void prompt(Scanner scanner) {
        System.out.println("enter the length");
        setLength(scanner.nextInt());
        System.out.println("Area is:"+ calculateArea());
        System.out.println("Perimeter is:"+ calculatePerimeter());

    }

    @Override
    public int calculateArea() {
        return getLength() * getLength();
    }

    @Override
    public int calculatePerimeter() {
        return  getLength()*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sc=" + sc +
                '}';
    }
}
