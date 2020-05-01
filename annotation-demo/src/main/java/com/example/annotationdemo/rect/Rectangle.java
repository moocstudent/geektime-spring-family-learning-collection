package com.example.annotationdemo.rect;

public class Rectangle {
    private Point topLeft;
    private int width;
    private int height;
    public Rectangle(Point topLeft,int width,int height){
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public Point getTopLeft(){return topLeft;}

    public int getWidth(){return width;}

    public int getHeight(){return height;}
}
