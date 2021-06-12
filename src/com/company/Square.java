package com.company;

public class Square extends Figure {
    private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Square(double a, double b) {
        super(a, b);
        x = Math.min(a, b);
    }

    public double getArea() {
        return 0;
    }

    public String getName() {
        return "Square";
    }

    public double getSquare() {
        return x * x;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * x;
    }
}
