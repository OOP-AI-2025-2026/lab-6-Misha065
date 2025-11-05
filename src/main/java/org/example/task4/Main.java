package org.example.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<org.example.task4.Car> cars = new ArrayList<>();

        cars.add(new org.example.task4.Car(69000, 2020, 295));
        cars.add(new org.example.task4.Car(1900, 1998, 85));
        cars.add(new org.example.task4.Car(35000, 2018, 200));
        cars.add(new org.example.task4.Car(52000, 2022, 305));
        cars.add(new org.example.task4.Car(1500, 1998, 115));

        System.out.println(" Початковий список:");
        cars.forEach(System.out::println);

        Collections.sort(cars);

        System.out.println("\n Відсортовано за умовою:");
        cars.forEach(System.out::println);
    }
}