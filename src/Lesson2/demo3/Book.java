package Lesson2.demo3;

import lombok.*;


public class Book extends Papyrus{
    private String author;
    private String title;
    private int pages;

    public Book(int age, String material, String author, String title, int pages) {
        super(age, material);
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
