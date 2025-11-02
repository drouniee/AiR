package ru.mirea.lab7.num8;

class Book implements Printable {
    private String name;
    private String author;
    private int date;

    public Book(String name, String author, int date){
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getDate(){
        return date;
    }

    @Override
    public void print(){
        System.out.println("Название книги: " + name + ", автор " + author + ", дата выпуска: " + date);
    }

    public static void printBooks(Printable[] printables){
        for (Printable p: printables){
            if (p instanceof Book){
                p.print();
            }
        }
    }
}
