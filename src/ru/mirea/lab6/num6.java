package ru.mirea.lab6;

interface Printable {
    void print();
}

class TestClass implements Printable {
    @Override
    public void print() {
        System.out.println("Test");
    }
}

public class num6 {
    public static void main(String[] args) {
        Printable test = new TestClass();
        test.print();
    }
}