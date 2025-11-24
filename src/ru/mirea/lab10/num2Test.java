package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Arrays;

public class num2Test {
    public static void main(String[] args) {
        ArrayList<Student> list1 = new ArrayList<>(Arrays.asList(
                new Student("Имяил", "Фамилиянов", "Искусственный интеллект", 2, "КВБО-13-24", 4.2),
                new Student("Иван", "Иванов", "Математика", 3, "КККО-11-21", 4.9),
                new Student("Алексей", "Сидоров", "Анализ данных", 2, "БМБО-04-24", 4.1)
        ));

        ArrayList<Student> list2 = new ArrayList<>(Arrays.asList(
                new Student("Ольга", "Кузнецова", "Информатика", 1, "АЫВФ-22-25", 4.5),
                new Student("Дмитрий", "Васильев", "Интеллектуальные системы", 2, "МСЧЧ-12-22", 4.4),
                new Student("Елена", "Попова", "Разработка", 3, "НУКЕ-02-24", 4.8)
        ));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        ArrayList<Student> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        sorter.setArray(mergedList);

        System.out.println("Исходный список:\n");
        sorter.outArray();

        System.out.println("\nСортировка по GPA (убывающая) - быстрая сортировка:\n");
        sorter.quickSort(sorter.new GPAComparator());
        sorter.outArray();

        System.out.println("\nСортировка по фамилии - сортировка слиянием:\n");
        sorter.mergeSort(sorter.new NameComparator());
        sorter.outArray();

        System.out.println("\nСортировка по нескольким критериям:\n");
        sorter.sortByMultipleCriteria();
        sorter.outArray();
    }
}