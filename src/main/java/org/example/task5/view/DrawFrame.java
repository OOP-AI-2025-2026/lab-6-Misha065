package org.example.task5.view;

import org.example.task5.model.DrawShape;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class DrawFrame extends JFrame {

    private final PaintSurface surface = new PaintSurface();

    public DrawFrame(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(createButtonPanel(), BorderLayout.NORTH);
        add(surface, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.setBackground(Color.CYAN);
        panel.setBorder(new LineBorder(Color.BLACK, 2));

        BigTextButton rect = new BigTextButton("Rectangle");
        rect.addActionListener(e -> surface.setShapeType(DrawShape.RECTANGLE));

        BigTextButton round = new BigTextButton("Rounded");
        round.addActionListener(e -> surface.setShapeType(DrawShape.ROUNDED_RECTANGLE));

        BigTextButton ell = new BigTextButton("Ellipse");
        ell.addActionListener(e -> surface.setShapeType(DrawShape.ELLIPSE));

        BigTextButton clear = new BigTextButton("Clear");
        clear.addActionListener(e -> surface.clearShapes());

        BigTextButton undo = new BigTextButton("Undo");
        undo.addActionListener(e -> surface.undoLastShape());

        panel.add(rect);
        panel.add(round);
        panel.add(ell);
        panel.add(clear);
        panel.add(undo);

        return panel;
    }
}