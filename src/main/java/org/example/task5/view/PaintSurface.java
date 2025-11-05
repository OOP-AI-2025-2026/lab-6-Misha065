package org.example.task5.view;

import org.example.task5.model.DrawShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.util.*;

public class PaintSurface extends JComponent {

    private final java.util.List<DrawShape> shapes = new ArrayList<>();
    private int shapeType = DrawShape.RECTANGLE;
    private Point startDrag, endDrag;
    private final java.util.List<Color> colors = Arrays.asList(Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA, Color.CYAN);
    private final Random rand = new Random();

    public PaintSurface() {
        setPreferredSize(new Dimension(600, 400));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startDrag = e.getPoint();
                endDrag = startDrag;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                endDrag = e.getPoint();
                Color color = colors.get(rand.nextInt(colors.size()));
                DrawShape shape = DrawShape.createShape(shapeType, startDrag, endDrag, color);
                if (shape != null) shapes.add(shape);
                startDrag = endDrag = null;
                repaint();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                endDrag = e.getPoint();
                repaint();
            }
        });
    }

    public void setShapeType(int shapeType) {
        this.shapeType = shapeType;
    }

    public void clearShapes() {
        shapes.clear();
        repaint();
    }

    public void undoLastShape() {
        if (!shapes.isEmpty()) {
            shapes.remove(shapes.size() - 1);
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        paintGrid(g2);

        for (DrawShape s : shapes) {
            g2.setPaint(Color.BLACK);
            g2.draw(s.getShape());
            g2.setPaint(s.getColor());
            g2.fill(s.getShape());
        }

        if (startDrag != null && endDrag != null) {
            g2.setPaint(Color.LIGHT_GRAY);
            DrawShape preview = DrawShape.createShape(shapeType, startDrag, endDrag, Color.GRAY);
            g2.draw(preview.getShape());
        }
    }

    private void paintGrid(Graphics2D g2) {
        g2.setPaint(Color.LIGHT_GRAY);
        for (int i = 0; i < getWidth(); i += 10)
            g2.draw(new Line2D.Float(i, 0, i, getHeight()));
        for (int i = 0; i < getHeight(); i += 10)
            g2.draw(new Line2D.Float(0, i, getWidth(), i));
    }
}