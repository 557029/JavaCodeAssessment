package com.bah.javachallenge.square;

public class SquareChecker {
    public static void main(String[] args) {
        final Shape shape1 = new Square1(3);
        final Shape shape2 = new Square2(2);
        final Shape shape3 = new Square3(2,3);

        System.out.println(shape1.perimeter() + " " + shape1.area());
        System.out.println(shape2.perimeter() + " " + shape2.area());
        System.out.println(shape3.perimeter() + " " + shape3.area());
    }

}
