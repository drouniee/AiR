package ru.mirea.num19.num2;

import java.util.List;

public class StudentSearch {
    public static Student findStudentByName(List<Student> students, String fullName) {
        for(Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент " + fullName + " не найден");
    }
}