package com.john.shapes;

import java.util.Scanner;

public class Box  extends Rectangle{

    private Scanner sc;

    public Box() {
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
        return getLength()*getWidth();
    }

    @Override
    public int calculatePerimeter() {
        return 2*(getLength()+getWidth());
    }
}
