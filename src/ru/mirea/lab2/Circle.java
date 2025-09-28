package ru.mirea.lab2;
import java.math.*;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX(){ return x; }

    public void setX(double x){ this.x = x; }

    public double getY(){ return y; }

    public void setY(double y){ this.y = y; }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getR(){ return r; }

    public void setR(double r){ this.r = r; }

    public double getSquare(){ return Math.PI * (Math.pow(r, 2)); }

    public double getLength(){ return 2 * Math.PI * r; }

    public String toCompare(Circle other){
        if (this.r > other.r){
            return "Первая окружность больше второй.";
        } else if (this.r < other.r){
            return "Вторая окружность больше первой.";
        }else{
            return "Окружности равны.";
        }
    }

    public String toString(){ return "x = " + x + ", y = " + y + ", R = " + r; }

}
