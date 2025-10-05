package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;

public class num3 {
    public static void main(String[] args) {
        String imagePath = args[0];

        JFrame frame = new JFrame("Просмотр картинки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.setLocationRelativeTo(null);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);

        JScrollPane scrollPane = new JScrollPane(imageLabel);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
//E:
//cd E:\JavaProjects\KVBO-13-24_Druzhnov_Maksim\src
//javac ru/mirea/lab5/num3.java
//java ru.mirea.lab5.num3 "ru/mirea/lab5/pupupu.png"