package com.example.annotationdemo.rect;

public class Rectangle {
    private final Point topLeft;
    private final int width;
    private final int height;
    public Rectangle(Point topLeft,int width,int height){
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public Point getTopLeft(){return topLeft;}

    public int getWidth(){return width;}

    public int getHeight(){return height;}
}
