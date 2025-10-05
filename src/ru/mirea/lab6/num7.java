package ru.mirea.lab6;

//interface Printable {
//    void print();
//}

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга: '" + title + "' автор: " + author);
    }
}

public class num7 {
    public static void main(String[] args) {
        Book book = new Book("Преступление и наказание", "Ф.М. Достоевский");
        book.print();
    }
}