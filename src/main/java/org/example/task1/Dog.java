package org.example.task1;

public class Dog extends org.example.task1.Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Гав-гав";
    }
}