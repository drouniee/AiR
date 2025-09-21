package ru.mirea.lab1;

import java.util.Scanner;

public class num4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        System.out.println("Введите элементы массива:");
        int i = 0;
        do {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
            i++;
        } while (i < size);

        System.out.print("Массив: ");
        i = 0;
        while (i < size){
            System.out.print(arr1[i] + " ");
            i++;
        }
        System.out.println("");

        int mx = arr1[0];
        int mn = arr1[0];
        i = 0;
        while (i < size){
            if (arr1[i] > mx){
                mx = arr1[i];
            }
            if (arr1[i] < mn){
                mn = arr1[i];
            }
            i++;
        }
        System.out.println("Максимальное число: " + mx);
        System.out.println("Минимальное число: " + mn);

    }
}
