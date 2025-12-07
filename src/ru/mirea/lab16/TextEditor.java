package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    JTextArea textArea;

    public TextEditor() {
        super("Текстовый редактор");

        textArea = new JTextArea(10, 30);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenu colorMenu = new JMenu("Цвет");
        colorMenu.add(createColorItem("Синий", Color.BLUE));
        colorMenu.add(createColorItem("Красный", Color.RED));
        colorMenu.add(createColorItem("Черный", Color.BLACK));

        JMenu fontMenu = new JMenu("Шрифт");
        fontMenu.add(createFontItem("Times New Roman", "Times New Roman"));
        fontMenu.add(createFontItem("MS Sans Serif", "MS Sans Serif"));
        fontMenu.add(createFontItem("Courier New", "Courier New"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        setJMenuBar(menuBar);

        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JMenuItem createColorItem(String name, Color color) {
        JMenuItem item = new JMenuItem(name);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(color);
            }
        });
        return item;
    }

    private JMenuItem createFontItem(String name, String fontName) {
        JMenuItem item = new JMenuItem(name);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font(fontName, Font.PLAIN, 14));
            }
        });
        return item;
    }

}