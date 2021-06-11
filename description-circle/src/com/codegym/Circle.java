package com.codegym;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {

    }

    Circle(double r) {
        this.radius = r;
    }

    private double getRadius() {
        return this.radius;
    }
    private double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    public String toString() {
        return "Circle{radius: " + this.radius + ", color: " + this.color + ", area: " + this.getArea() + "}" ;
    }
}
