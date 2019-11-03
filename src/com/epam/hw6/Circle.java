package com.epam.hw6;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("%s %s %7.2f \n", this.toString(), "; area= ", this.calcArea());
    }

    @Override
    public String toString() {
        return "Circle" + ", color: " + super.getColor() +
                ", radius=" + radius;
    }
    @Override
    public String toString(String s) {
        return null;
    }
}
