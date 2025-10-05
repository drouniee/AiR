package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

class Triangle extends Shape {
    private int size;

    public Triangle(Color color, int x, int y, int size) {
        super(color, x, y);
        this.size = size;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {x, x - size/2, x + size/2};
        int[] yPoints = {y, y + size, y + size};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}

public class RandomShapes extends JFrame {
    private ArrayList<Shape> shapes;
    private Random random;

    public RandomShapes() {
        setTitle("20 Random Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        shapes = new ArrayList<>();
        random = new Random();

        generateShapes();
    }

    private void generateShapes() {
        for (int i = 0; i < 20; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            int x = random.nextInt(700);
            int y = random.nextInt(500);

            int shapeType = random.nextInt(3);

            switch (shapeType) {
                case 0:
                    int radius = 20 + random.nextInt(50);
                    shapes.add(new Circle(color, x, y, radius));
                    break;
                case 1:
                    int width = 30 + random.nextInt(100);
                    int height = 30 + random.nextInt(100);
                    shapes.add(new Rectangle(color, x, y, width, height));
                    break;
                case 2:
                    int size = 30 + random.nextInt(80);
                    shapes.add(new Triangle(color, x, y, size));
                    break;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RandomShapes().setVisible(true);
            }
        });
    }
}