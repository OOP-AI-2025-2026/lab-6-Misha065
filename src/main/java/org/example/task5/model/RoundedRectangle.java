package org.example.task5.model;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedRectangle extends DrawShape {

    public RoundedRectangle(Point start, Point end, Color color) {
        super(start, end, color);
    }

    @Override
    public Shape getShape() {
        return new RoundRectangle2D.Double(
                Math.min(startPoint.x, endPoint.x),
                Math.min(startPoint.y, endPoint.y),
                Math.abs(startPoint.x - endPoint.x),
                Math.abs(startPoint.y - endPoint.y),
                40, 40
        );
    }
}