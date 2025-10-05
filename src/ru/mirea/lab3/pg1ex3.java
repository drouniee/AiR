package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;

public class pg1ex3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(90);
        }

        System.out.println("Массив: " + Arrays.toString(array));

        boolean incr = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i-1]) {
                incr = false;
                break;
            }
        }

        if (incr) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью");
        }
    }
}