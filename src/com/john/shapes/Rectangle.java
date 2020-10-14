package com.john.shapes;

import com.john.shapes.Shape;

import java.util.Scanner;

public class Rectangle extends Shape {


    int length = Math.abs(sc.nextInt());
    int  width = Math.abs(sc.nextInt());

    public Rectangle(){
    }

    @Override
    public int calculateArea() {
        return  length * width;
    }

    @Override
    public int calculatePerimeter() {
        return 2 *(length + width);
    }
}
