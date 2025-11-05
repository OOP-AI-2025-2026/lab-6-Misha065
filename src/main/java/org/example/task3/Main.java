package org.example.task3;

public class Main {
    public static void main(String[] args) {
        org.example.task3.Smartphone phone = new org.example.task3.Smartphone("Samsung Galaxy S24 Ultra");

        phone.makeCall("+3805012533456");
        phone.receiveCall("+380966698877");

        double[] coords = phone.getCoordinates();
        System.out.printf("Поточні координати: %.4f, %.4f%n", coords[0], coords[1]);
    }
}