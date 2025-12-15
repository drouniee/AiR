package ru.mirea.lab12.num13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class AnimatedShapesWindow extends JFrame {
    private Shape[] shapes;
    private Random random;
    private int[] directions;
    private double[] angles;

    public AnimatedShapesWindow() {
        super("Анимированные случайные фигуры");
        setLayout(new FlowLayout());

        random = new Random();
        shapes = new Shape[20];
        directions = new int[20];
        angles = new double[20];

        // Создаем случайные фигуры
        createRandomShapes();

        // Кнопки управления
        JButton startButton = new JButton("Старт");
        JButton stopButton = new JButton("Стоп");
        JButton resetButton = new JButton("Сброс");

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startAnimation();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopAnimation();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetShapes();
            }
        });

        add(startButton);
        add(stopButton);
        add(resetButton);

        setSize(500, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void createRandomShapes() {
        for (int i = 0; i < shapes.length; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            int x = random.nextInt(450);
            int y = 100 + random.nextInt(400);

            int shapeType = random.nextInt(3); // 0 - круг, 1 - прямоугольник, 2 - треугольник

            switch (shapeType) {
                case 0:
                    shapes[i] = new Circle(color, x, y, random.nextInt(30) + 10);
                    break;
                case 1:
                    shapes[i] = new Rectangle(color, x, y,
                            random.nextInt(40) + 20, random.nextInt(40) + 20);
                    break;
                case 2:
                    shapes[i] = new Triangle(color, x, y, random.nextInt(40) + 20);
                    break;
            }

            directions[i] = random.nextBoolean() ? 1 : -1;
            angles[i] = random.nextDouble() * 2 * Math.PI;
        }
    }

    // Таймер для анимации
    Timer timer = new Timer(50, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < shapes.length; i++) {
                int newX = shapes[i].getX();
                int newY = shapes[i].getY();

                // Разные траектории для разных фигур
                if (i % 4 == 0) {
                    // Горизонтальное движение
                    newX += 3 * directions[i];
                    if (newX > 450 || newX < 0) {
                        directions[i] *= -1;
                    }
                }
                else if (i % 4 == 1) {
                    // Вертикальное движение
                    newY += 2 * directions[i];
                    if (newY > 500 || newY < 100) {
                        directions[i] *= -1;
                    }
                }
                else if (i % 4 == 2) {
                    // Движение по диагонали
                    newX += 4 * directions[i];
                    newY += 2 * directions[i];
                    if (newX > 450 || newX < 0 || newY > 500 || newY < 100) {
                        directions[i] *= -1;
                    }
                }
                else {
                    // Круговое движение
                    angles[i] += 0.05;
                    newX = 200 + (int)(100 * Math.cos(angles[i]));
                    newY = 200 + (int)(100 * Math.sin(angles[i]));
                }

                shapes[i].setPosition(newX, newY);
            }

            repaint();
        }
    });

    private void startAnimation() {
        timer.start();
    }

    private void stopAnimation() {
        timer.stop();
    }

    private void resetShapes() {
        timer.stop();
        createRandomShapes();
        repaint();
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
                new AnimatedShapesWindow().setVisible(true);
            }
        });
    }
}