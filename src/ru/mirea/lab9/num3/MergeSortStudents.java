package ru.mirea.lab9.num3;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {

    public List<Student> mergeAndSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        if (list1 != null) mergedList.addAll(list1);
        if (list2 != null) mergedList.addAll(list2);

        return mergeSort(mergedList);
    }

    private List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Student> left = new ArrayList<>(list.subList(0, mid));
        List<Student> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGPA() >= right.get(j).getGPA()) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}