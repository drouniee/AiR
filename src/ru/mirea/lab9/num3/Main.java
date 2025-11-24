package ru.mirea.lab9.num3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list1 = Arrays.asList(
                new Student("Иван Иванов", 1, 4.5),
                new Student("Петр Петров", 2, 3.8),
                new Student("Мария Сидорова", 3, 4.9)
        );

        List<Student> list2 = Arrays.asList(
                new Student("Анна Козлова", 4, 4.2),
                new Student("Сергей Смирнов", 5, 3.5),
                new Student("Елена Новикова", 6, 4.7)
        );

        System.out.println("Первый список:");
        printStudents(list1);

        System.out.println("\nВторой список:");
        printStudents(list2);

        MergeSortStudents sorter = new MergeSortStudents();
        List<Student> mergedAndSorted = sorter.mergeAndSort(list1, list2);

        System.out.println("\nОбъединенный отсортированный список (по убыванию GPA):");
        printStudents(mergedAndSorted);
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}