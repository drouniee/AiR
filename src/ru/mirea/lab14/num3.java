package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class num3 {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 100 RUB, 44 ERR, 0.004 EU, 50.50EU, 0.5 USD, 1500.75RUB";

        String regex = "\\b(\\d+(?:\\.\\d+)?)\\s*(USD|RUB|EU)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            String price = matcher.group(1);
            String currency = matcher.group(2);

            if (!price.startsWith("0.")) {
                System.out.println(price + " " + currency);
            }
        }
    }
}