package com.company;


import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class Main {

    public static void main(String[] args) {
        Figure[] figure = {new Figure(10, 24),
                          new Triangle(10, 8, 10),
                          new Circle(20),
                          new Square(10, 10),
                          new Ellipse(500, 400)};

        for (Figure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea());
    }

    private static class Triangle {
        public Triangle(int i, int i1, int i2) {
        }
    }

    private static class Square {
        public Square(int i, int i1) {
        }
    }
}