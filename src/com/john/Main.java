package com.john;

import com.john.shapes.*;
import com.john.shapes.Rectangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//  west25000

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> shapes=new ArrayList<>();
        int choice = 1;

        do{
            System.out.println("select:" +
                            "0 to exit the program\n" +
                    " 1 for rectangle instance \n" +
                    "2 for Tetrahedron instance \n" +
                    "3 for  Square instance \n" +
                    "4 for  Box instance \n" +
                    "5 for  Cube instance \n" +
                    "6 for Circle instance \n" +
                    "7 for Triangle instance \n" +
                    "8 for Ellipse instance \n" +
                    "9 for Sphere instance \n"
            );
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    Rectangle rectangle = new Rectangle();
                    shapes.add(rectangle.toString());
                    break;
                case 2:
                    Tetrahedron tetrahedron = new Tetrahedron();
                    shapes.add(tetrahedron.toString());
                    break;
                case 3:
                    Square square = new Square();
                    shapes.add(square.toString());
                    break;
                case 4:
                    Box box = new Box();
                    shapes.add(box.toString());
                    break;
                case 5:
                    Cube cube = new Cube();
                    shapes.add(cube.toString());;
                    break;
                case 6:
                    Circle circle = new Circle();
                    shapes.add(circle.toString());
                    break;
                case 7:
                    Triangle triangle = new Triangle();
                    shapes.add(triangle.toString());
                    break;
                case 8:
                    Ellipse ellipse = new Ellipse();
                    shapes.add(ellipse.toString());
                    break;
                case 9:
                    Sphere sphere = new Sphere();
                    shapes.add(sphere.toString());
                    break;
                case 0:
                    System.out.println("Goodbye...");
                    break;
                default:
                    System.out.println("invalid Option");
                    break;

            }

        }while(choice != 0);
    }

}



