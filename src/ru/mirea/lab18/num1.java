package ru.mirea.lab18;

public class num1 {
    public void exceptionDemo() {
        System.out.println(2 / 0);
    }

    public void exceptionDemoDouble() {
        System.out.println(2.0 / 0.0);
    }

    public void exceptionDemoWithTryCatch() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
    public static void main(String[] args) {
        num1 demo = new num1();

        System.out.println("Деление int на ноль");
        demo.exceptionDemo();

        System.out.println("\nДеление double на ноль");
        demo.exceptionDemoDouble();

        System.out.println("\nС обработкой исключения");
        demo.exceptionDemoWithTryCatch();
    }
}