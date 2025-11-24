package ru.mirea.lab9.num2;

import java.util.Comparator;
import java.util.List;

public class SortingGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getGPA(), student1.getGPA());
    }

    public void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(students.get(j), pivot) < 0) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }

    public void sort(List<Student> students) {
        if (students != null && !students.isEmpty()) {
            quickSort(students, 0, students.size() - 1);
        }
    }
}