package org.example.task1;

public class Cat extends org.example.task1.Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Мяу";
    }
}