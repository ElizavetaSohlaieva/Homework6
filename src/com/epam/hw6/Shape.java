package com.epam.hw6;

public abstract class Shape implements Drawable {
    private String color;


    public Shape(String color){this.color = color;}

    public abstract double calcArea();

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract String toString(String s);

    public String getColor() {
        return color;
    }


}
