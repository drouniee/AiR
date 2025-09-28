package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args) {

        Ball ball = new Ball(11.1, 12.2);
        System.out.println(ball.toString());

        System.out.println("x: " + ball.getX());
        System.out.println("y: " + ball.getY());

        System.out.println();
        ball.setX(4.4);
        ball.setY(15.2);
        System.out.println("x: " + ball.getX());
        System.out.println("y: " + ball.getY());

        System.out.println();
        ball.setXY(1.2, 1.6);
        System.out.println("x: " + ball.getX());
        System.out.println("y: " + ball.getY());

        System.out.println();
        ball.move(101.2, 102.4);
        System.out.println("x: " + ball.getX());
        System.out.println("y: " + ball.getY());

    }
}
