package com.bah.javachallenge.square;

// Consider square is Rectangular
//
public class Square3 implements Shape {
    private int sizeA = 0;
    private int sizeB = 0;

    public Square3(int sizeA, int sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    @Override
    public int perimeter() {
        return 2 * (this.sizeA + this.sizeB);
    }

    @Override
    public int area() {
        return this.sizeA * this.sizeB;
    }
}
