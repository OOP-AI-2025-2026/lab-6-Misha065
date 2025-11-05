package org.example.task5.model;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ellipse extends DrawShape {

    public Ellipse(Point start, Point end, Color color) {
        super(start, end, color);
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(
                Math.min(startPoint.x, endPoint.x),
                Math.min(startPoint.y, endPoint.y),
                Math.abs(startPoint.x - endPoint.x),
                Math.abs(startPoint.y - endPoint.y)
        );
    }
}