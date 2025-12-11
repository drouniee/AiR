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

            // Создаем SimpleDateFormat для отображения полной даты с временем
            SimpleDateFormat fullDateFormatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.SSS");

            System.out.println("Текущая дата и время: " + fullDateFormatter.format(currentDate));
            System.out.println("Введенная дата: " + fullDateFormatter.format(userDate));

            // Сравниваем даты в миллисекундах
            long userTime = userDate.getTime();
            long currentTime = currentDate.getTime();

            System.out.println("Текущая дата в мс: " + currentTime);
            System.out.println("Введенная дата в мс: " + userTime);

            if (userTime == currentTime) {
                System.out.println("Даты РАВНЫ (вплоть до миллисекунд)");
            } else if (userTime < currentTime) {
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