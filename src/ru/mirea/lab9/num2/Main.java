package ru.mirea.lab9.num2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван Иванов", 1, 4.5));
        students.add(new Student("Петр Петров", 2, 3.8));
        students.add(new Student("Мария Сидорова", 3, 4.9));
        students.add(new Student("Анна Козлова", 4, 3.2));

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        SortingGPA sorter = new SortingGPA();
        sorter.sort(students);

        System.out.println("\nПосле сортировки по GPA (убывание):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}