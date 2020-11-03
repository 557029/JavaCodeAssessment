package com.bah.javachallenge.square;

// Consider square is Square and it has the same size or sides
//
public class Square2 implements Shape {
    private int sideSize = 0;

    public Square2(int sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public int perimeter() {
        // Let's do it in crazy way
        //
        return this.sideSize + this.sideSize + this.sideSize + this.sideSize;
    }

    @Override
    public int area() {
        // Just because it is square.
        return (int) Math.pow(this.sideSize, 2);
    }
}
