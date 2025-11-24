package ru.mirea.lab10;

import java.util.*;

public class num3 {
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

        // объединяем
        ArrayList<Student> mergedList = mergeStudentLists(list1, list2);
        System.out.println("\nОбъединенный список (до сортировки):");
        printStudents(mergedList);

        // сортируем по GPA
        sortStudentsByGPA(mergedList);
        System.out.println("\nОбъединенный список (после сортировки по GPA):");
        printStudents(mergedList);

        // сортируем по имени
        sortStudentsByName(mergedList);
        System.out.println("\nОбъединенный список (после сортировки по имени):");
        printStudents(mergedList);
    }

    // метод для объединения двух списков
    public static ArrayList<Student> mergeStudentLists(ArrayList<Student> list1, ArrayList<Student> list2) {
        ArrayList<Student> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        return merged;
    }

    // метод для сортировки по GPA
    public static void sortStudentsByGPA(ArrayList<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGpa(), s1.getGpa()); // убывающий порядок
            }
        });
    }

    // метод для сортировки по фамилии и имени
    public static void sortStudentsByName(ArrayList<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // сначала сравниваем по фамилии
                int lastNameCompare = s1.getLastName().compareTo(s2.getLastName());
                if (lastNameCompare != 0) {
                    return lastNameCompare;
                }
                // если фамилии одинаковые, сравниваем по имени
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
        });
    }

    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
