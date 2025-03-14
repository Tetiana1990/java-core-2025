package Lesson3.demo1;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book("Book 1"));
        printables.add(new Book("Book 2"));
        printables.add(new Magazine("Magazine 1"));
        printables.add(new Magazine("Magazine 2"));

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
