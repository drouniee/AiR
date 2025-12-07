package ru.mirea.lab16;

import javax.swing.*;

public class TestTEditor {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextEditor();
            }
        });
    }

}
