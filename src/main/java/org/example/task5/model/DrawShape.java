package org.example.task5.model;

import java.awt.*;


public abstract class DrawShape {

    public static final int RECTANGLE = 0;
    public static final int ROUNDED_RECTANGLE = 1;
    public static final int ELLIPSE = 2;

    protected Point startPoint;
    protected Point endPoint;
    protected Color color;

    public DrawShape(Point startPoint, Point endPoint, Color color) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.color = color;
    }

    public abstract Shape getShape();

    public static DrawShape createShape(int shapeType, Point start, Point end, Color color) {
        return switch (shapeType) {
            case RECTANGLE -> new Rectangle(start, end, color);
            case ROUNDED_RECTANGLE -> new RoundedRectangle(start, end, color);
            case ELLIPSE -> new Ellipse(start, end, color);
            default -> null;
        };
    }

    public Color getColor() {
        return color;
    }
}