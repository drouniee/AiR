package ru.mirea.lab13.num5;

import static ru.mirea.lab13.num5.PhoneNumberFormatter.formatPhoneNumber;

public class PhoneTest {
    public static void main(String[] args) {
        String[] testNumbers = {
                "+79175655655",
                "+104289652211",
                "89175655655",
                "+442012345678"
        };

        for (String number : testNumbers) {
            String formatted = formatPhoneNumber(number);
            System.out.println(number + " -> " + formatted);
        }
    }
}
