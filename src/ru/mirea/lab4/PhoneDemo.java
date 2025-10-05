package ru.mirea.lab4;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+79994449922", "iPhone 15", 0.171);
        Phone phone2 = new Phone("+79876543322", "Samsung Galaxy", 0.168);
        Phone phone3 = new Phone("+78005553535", "Xiaomi Redmi", 0.185);

        System.out.println("Телефон 1: " + phone1);
        System.out.println("Телефон 2: " + phone2);
        System.out.println("Телефон 3: " + phone3);
        System.out.println();

        phone1.receiveCall("Илья Тренер по йоге");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println();

        phone2.receiveCall("Ксюша :))");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println();

        phone3.receiveCall("Пятерочка");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println();

        phone1.receiveCall("Илья Тренер по йоге", "+78080808080");
        phone2.receiveCall("Ксюша :))", "+78080808080");
        System.out.println();

        phone1.sendMessage("+79001111111", "+79002222222", "+79003333333");
        System.out.println();

        Phone phone4 = new Phone("+79045556677", "Nokia");
        Phone phone5 = new Phone();

        System.out.println("Телефон 4 (2 параметра): " + phone4);
        System.out.println("Телефон 5 (без параметров): " + phone5);
    }
}