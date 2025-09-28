package ru.mirea.lab2;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 10);
        Circle circle2 = new Circle(1, 4, 1);
        Circle circle3 = new Circle(4, 6, 1);

        System.out.println(circle1.toString());

        System.out.println();
        System.out.println(circle1.getX());
        System.out.println(circle1.getY());
        System.out.println(circle1.getR());

        System.out.println();
        circle1.setX(15);
        circle1.setY(15);
        circle1.setR(15);
        System.out.println(circle1.toString());

        System.out.println();
        System.out.println(circle1.getSquare());
        System.out.println(circle1.getLength());

        System.out.println();
        System.out.println(circle1.toCompare(circle2));
        System.out.println(circle2.toCompare(circle1));
        System.out.println(circle2.toCompare(circle3));
    }
}
