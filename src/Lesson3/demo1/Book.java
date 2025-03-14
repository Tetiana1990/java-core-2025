package Lesson3.demo1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Printable{
    private String title;

    @Override
    public void print() {
        System.out.println("Book title: " + title);
    }
}
