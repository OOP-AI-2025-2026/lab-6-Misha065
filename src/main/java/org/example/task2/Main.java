package org.example.task2;

public class Main {
    public static void main(String[] args) {
        org.example.task2.Point p = new org.example.task2.Point(3.5, 7.0);
        System.out.println("Початкові коорди: " + p);

        p.moveTo(10.0, 15.0);
        System.out.println("Після переміщення: " + p);
    }
}