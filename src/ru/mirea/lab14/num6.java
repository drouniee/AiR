package ru.mirea.lab14;

import java.util.regex.Pattern;

public class num6 {
    public static void main(String[] args) {
        String[] emails = {
                "drouniee@gmail.com",
                "test@example.com",
                "root@localhost",
                "myhost@@com.ru",
                "@my.ru",
                "Julia String"
        };

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        for (String email : emails) {
            if (Pattern.matches(regex, email)) {
                System.out.println(email + " - корректный email");
            } else {
                System.out.println(email + " - некорректный email");
            }
        }
    }
}
