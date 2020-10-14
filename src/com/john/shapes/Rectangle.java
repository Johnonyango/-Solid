package com.john.shapes;

import com.john.shapes.Shape;

import java.util.Scanner;

public class Rectangle extends Shape {

    public Rectangle(){
        sc=new Scanner(System.in);

        System.out.println("enter the length ");
        int length = Math.abs(sc.nextInt());

        System.out.println("enter the width ");
        int  width = Math.abs(sc.nextInt());


    }

    @Override
    public int calculateArea() {
        return  0;
    }

    @Override
    public int calculatePerimeter() {
        return 0;
    }
}
