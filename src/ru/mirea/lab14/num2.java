package ru.mirea.lab14;

import java.util.regex.Pattern;

public class num2 {
    public static void main(String[] args) {
        String test = "abcdefghijklmnopqrstuv18340";

        System.out.println(test.matches("abcdefghijklmnopqrstuv18340"));
        System.out.println(test.matches("abcdefghijklmnoasdfasdpqrstuv18340."));
    }
}
