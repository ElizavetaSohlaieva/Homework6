package com.epam.hw6;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }
    @Override
    public double calcArea() {
        return height * width;
    }

      @Override
    public String toString() {
        return "Rectangle" + ", color: " + super.getColor() +
                ", height=" + height +
                ", width=" + width;
    }
    @Override
    public String toString(String s) {
        return null;
    }
    @Override
    public void draw() {
        System.out.printf("%s %s %7.2f \n", this.toString(), "; area= ", this.calcArea());
    }
}
