package com.epam.hw6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("red", 10),
                new Circle("blue", 13),
                new Circle("black", 20),
                new Triangle("black", 10, 7, 9),
                new Triangle("red", 30, 15, 20),
                new Rectangle("blue", 10, 30),
                new Rectangle("yellow", 7, 12),
                new Rectangle("green", 5, 9),
                new Rectangle("purple", 23, 67)
        };

        for (Shape sh : shapes) {
            sh.draw();
        }
        Arrays.sort(shapes, new MyComparatorColor());
        System.out.println("---------------");
        for (Shape sh : shapes) {
            sh.draw();
        }
        System.out.println("---------------");

        double totalArea = 0;
        double totalCircle = 0;
        double totalTriangle = 0;
        double totalRectangle = 0;
        for (Shape sh : shapes) {
            totalArea += sh.calcArea();
            if (sh instanceof Circle){
                totalCircle += sh.calcArea();
            }else if (sh instanceof Triangle){
                totalTriangle += sh.calcArea();
            }else if (sh instanceof Rectangle){
                totalRectangle += sh.calcArea();
            }
        }
        System.out.printf("Total area = %.2f\n", totalArea);
        System.out.printf("Total circle = %.2f\n", totalCircle);
        System.out.printf("Total triangle = %.2f\n", totalTriangle);
        System.out.printf("Total rectangle = %.2f\n", totalRectangle);
    }
}
