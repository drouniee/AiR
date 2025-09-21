package ru.mirea.lab1;

public class num3 {
    public static void main (String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Массив: ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int sm = 0;

        for (int i = 0; i < arr1.length; i++){
            sm += arr1[i];
        }

        float avg = (float) sm / arr1.length;

        System.out.println("Сумма: " + sm);
        System.out.println("Среднее арифметическое: " + avg);
    }
}
