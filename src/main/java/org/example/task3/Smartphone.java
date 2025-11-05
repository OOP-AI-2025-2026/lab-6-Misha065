package org.example.task3;

import java.util.Random;

public class Smartphone implements org.example.task3.GPS, org.example.task3.Cellular {

    private String model;

    public Smartphone(String model) {
        this.model = model;
    }

    @Override
    public double[] getCoordinates() {
        Random r = new Random();
        double latitude = 47.0 + r.nextDouble();   // умовні координати Одеси :)
        double longitude = 30.0 + r.nextDouble();
        return new double[]{latitude, longitude};
    }

    @Override
    public void makeCall(String number) {
        System.out.println(model + " Дзвінок на номер " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println(model + " Отримує виклик від " + number);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                '}';
    }
}