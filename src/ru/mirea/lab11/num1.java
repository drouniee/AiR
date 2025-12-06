package ru.mirea.lab11;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class num1 {
    public static void main(String[] args) {
        Date gettind_task = new Date();
        Date completing_task = new Date();

        String developer = "Дружнов";

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Фамилия разработчика: " + developer);
        System.out.println("Дата получения задания: " + dateFormatter.format(gettind_task));
        System.out.println("Дата сдачи задания: " + dateFormatter.format(completing_task));

    }
}