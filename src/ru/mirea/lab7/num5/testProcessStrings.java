package ru.mirea.lab7.num5;

public class testProcessStrings {
    public static void main(String[] args) {
        StringEditor editor = new ProcessStrings();
        String test = "Bara bara bara bere bere bere!";

        System.out.println(test);
        System.out.println(editor.countSymbols(test));
        System.out.println(editor.getOddChars(test));
        System.out.println(editor.reverseString(test));
    }
}
