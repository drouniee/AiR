package ru.mirea.lab12.num1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class ShapesWindow extends JFrame {
    private Shape[] shapes;

    public ShapesWindow() {
        super("20 Random Shapes");
        shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            int x = random.nextInt(400);
            int y = random.nextInt(400);

            if (random.nextBoolean()) {
                shapes[i] = new Circle(color, x, y, random.nextInt(50) + 2);
            }
            else {
                shapes[i] = new Rectangle(color, x, y, random.nextInt(50) + 10, random.nextInt(50) + 10);
            }
        }

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        new ShapesWindow().setVisible(true);
    }
}