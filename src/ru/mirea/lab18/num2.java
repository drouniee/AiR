package ru.mirea.lab18;

import java.util.Scanner;

public class num2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input");

        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        num2 demo = new num2();
        demo.exceptionDemo();
    }
}
