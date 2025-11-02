package ru.mirea.lab7.num8;

public class testBook {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("Название 1", "Автор 1", 1999),
                new Book("Название 2", "Автор 2", 1777)
        };

        Book.printBooks(printables);

    }
}
