package org.example.task5;

import org.example.task5.view.DrawFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DrawFrame("Програма Draw — Lab 6"));
    }
}