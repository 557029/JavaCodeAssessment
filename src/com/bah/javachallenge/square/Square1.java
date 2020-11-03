package com.bah.javachallenge.square;

// Consider square is Square and it has the same size or sides
//
public class Square1 implements Shape {
    private int sideSize = 0;

    public Square1(int sideSize) {
        this.sideSize = sideSize;
    }

    public Square1() {}

    @Override
    public int perimeter() {
        return this.sideSize * 4;
    }

    @Override
    public int area() {
        return this.sideSize * this.sideSize;
    }
}
