package ru.mirea.lab2;

public class DogKennels {
    public static void main(String[] args) {

        Dog dog = new Dog("Lil Bro", 4);
        System.out.println(dog.toString());

        System.out.println("Кличка: " + dog.getName());
        System.out.println("Возраст: " + dog.getAge());
        System.out.println("Человеческий возраст: " + dog.getHumanAge());

        System.out.println();
        dog.setName("Bobik");
        dog.setAge(8);
        System.out.println(dog.toString());

    }
}
