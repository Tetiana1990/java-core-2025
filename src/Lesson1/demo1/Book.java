package Lesson1.demo1;

import java.util.Arrays;

public class Book {
        private String title;
        private int pages;
        private String[] authors;
        private String genre;


        public Book(String title, int pages, String[] authors, String genre) {
            this.title = title;
            this.pages = pages;
            this.authors = authors;
            this.genre = genre;
        }

        public String[] getAuthors() {
            return authors;
        }

        public void setAuthors(String[] authors) {
            this.authors = authors;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }


        @Override
        public String toString() {
            return "Book{" +
                    "authors=" + Arrays.toString(authors) +
                    ", title='" + title + '\'' +
                    ", pages=" + pages +
                    ", genre='" + genre + '\'' +
                    '}';
        }
    }

