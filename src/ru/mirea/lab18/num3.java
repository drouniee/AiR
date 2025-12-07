package ru.mirea.lab18;

import java.util.Scanner;

public class num3 {

    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (Exception e) {
            System.out.println("Caught general Exception: " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());

        }
    }

    public static void main(String[] args) {
        num3 demo = new num3();
        demo.exceptionDemo();
    }
}