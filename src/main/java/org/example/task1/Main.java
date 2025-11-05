package org.example.task1;

public class Main {
    public static void main(String[] args) {
        org.example.task1.Animal dog = new org.example.task1.Dog("Мика");
        org.example.task1.Animal cat = new org.example.task1.Cat("Нюша");

        System.out.println(dog.getName() + ": " + dog.makeSound());
        System.out.println(cat.getName() + ": " + cat.makeSound());
    }
}