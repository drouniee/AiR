package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Druzhnov Maksim", "druzhnov.m.v@edu.mirea.ru", 'M');

        System.out.println(author.toString());

        System.out.println("Имя: " + author.getName());
        System.out.println("Почта: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        author.setEmail("drouniee@gmail.com");
        System.out.println("Новая почта: " + author.getEmail());

    }
}
