package ru.mirea.lab1;

public class num5 {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.println("Аргумент: " + str);
        }
    }
}

/*
E:
cd E:\JavaProjects\KVBO-13-24_Druzhnov_Maksim\src
javac ru/mirea/lab1/num5.java
java ru.mirea.lab1.num5 АРГУМЕНТЫ ЧЕРЕЗ ПРОБЕЛ
*/