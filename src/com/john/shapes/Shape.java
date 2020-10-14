package com.john.shapes;

import java.util.Scanner;

abstract class Shape {

    private int length;
    private int width;
    private int height;
    private int radius;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = Math.abs(length);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = Math.abs(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = Math.abs(height);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = Math.abs(radius);
    }

    public abstract void prompt(Scanner scanner);
    public abstract int calculateArea();
    public abstract int calculatePerimeter();

}
