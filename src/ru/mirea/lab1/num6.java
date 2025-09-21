package ru.mirea.lab1;

public class num6 {
    public static void main(String[] args) {
        double gr = 0;
        for (int i = 1; i < 11; i++){
            gr += (double) 1 / i;
            System.out.printf("%s = %f ", (i + " число гармонического ряда"), gr);
            System.out.println();
        }
    }
}