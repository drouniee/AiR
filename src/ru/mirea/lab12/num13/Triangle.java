package ru.mirea.lab12.num13;

import java.awt.*;

class Triangle extends Shape {
    private int size;

    public Triangle(Color color, int x, int y, int size) {
        super(color, x, y);
        this.size = size;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {x, x + size, x + size/2};
        int[] yPoints = {y + size, y + size, y};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    public int getSize() { return size; }
}