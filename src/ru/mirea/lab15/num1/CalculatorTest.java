package ru.mirea.lab15.num1;

import javax.swing.*;

public class CalculatorTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
}
