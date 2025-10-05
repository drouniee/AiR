package ru.mirea.lab4;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Илья Аверьянов", 64);

        System.out.println("Персона 1: " + person1);
        System.out.println("Персона 2: " + person2);
        System.out.println();

        person1.move();
        person1.talk();
        System.out.println();

        person2.move();
        person2.talk();
        System.out.println();

        person1.setFullName("Ксюша Горбунова");
        person1.setAge(19);

        person1.move();
        person1.talk();

        System.out.println(person1.getAge());
    }
}