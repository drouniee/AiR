package ru.mirea.lab11;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
        dateFormatter.setLenient(false);

        System.out.print("Введите дату для сравнения (дд.мм.гггг): ");
        String userInput = scanner.nextLine();

        try {
            Date userDate = dateFormatter.parse(userInput);

            Date currentDate = new Date();
            String currentDateStr = dateFormatter.format(currentDate);
            currentDate = dateFormatter.parse(currentDateStr);

            System.out.println("Текущая дата: " + dateFormatter.format(currentDate));
            System.out.println("Введенная дата: " + dateFormatter.format(userDate));

            if (userDate.equals(currentDate)) {
                System.out.println("Даты равны");
            } else if (userDate.before(currentDate)) {
                System.out.println("Введенная дата РАНЬШЕ текущей");
            } else {
                System.out.println("Введенная дата ПОЗЖЕ текущей");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка: некорректная дата. Пожалуйста, введите дату в формате дд.мм.гггг (например, 15.05.2023)");
        }

        scanner.close();
    }
}