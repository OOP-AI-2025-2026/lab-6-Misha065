package org.example.task5.model;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends DrawShape {

    public Rectangle(Point start, Point end, Color color) {
        super(start, end, color);
    }

    @Override
    public Shape getShape() {
        return new Rectangle2D.Double(
                Math.min(startPoint.x, endPoint.x),
                Math.min(startPoint.y, endPoint.y),
                Math.abs(startPoint.x - endPoint.x),
                Math.abs(startPoint.y - endPoint.y)
        );
    }
}