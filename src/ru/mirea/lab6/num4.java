package ru.mirea.lab6;

interface Priceable {
    double getPrice();
}

 class Product implements Priceable {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Computer implements Priceable {
    private double price;

    public Computer(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class num4 {
    public static void main(String[] args) {
        Priceable product = new Product(500.0);
        Priceable computer = new Computer(75000.0);

        System.out.println("Цена книги: " + product.getPrice() + " руб.");
        System.out.println("Цена компьютера: " + computer.getPrice() + " руб.");
    }
}