package ru.mirea.lab11;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class num1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2002, Calendar.AUGUST, 31, 0, 0, 0);
        Date gettind_task = cal.getTime();
        Date completing_task = new Date();

        String developer = "Дружнов";

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Фамилия разработчика: " + developer);
        System.out.println("Дата получения задания: " + dateFormatter.format(gettind_task));
        System.out.println("Дата сдачи задания: " + dateFormatter.format(completing_task));

    }
}