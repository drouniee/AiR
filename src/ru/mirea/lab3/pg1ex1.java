package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;

public class pg1ex1 {
    public static void main(String[] args) {
        int size = 13;

        double[] array1 = new double[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array1[i] = rand.nextInt(100);
        }
        System.out.println("До сортировки: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("После сортировки: " + Arrays.toString(array1));

        double[] array2 = new double[size];
        for (int i = 0; i < size; i++) {
            array2[i] = Math.random() * 100;
        }
        System.out.println("До сортировки: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("После сортировки: " + Arrays.toString(array2));
    }
}