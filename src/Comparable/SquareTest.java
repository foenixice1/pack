package Comparable;

import Inheritance.Shape;

public class SquareTest {
    public static void main(String[] args) {
        Shape.Circle.Rectangle.Square square = new Shape.Circle.Rectangle.Square();
        System.out.println(square);

        square = new Shape.Circle.Rectangle.Square(2.3);
        System.out.println(square);

        System.out.println(square);
    }
}
