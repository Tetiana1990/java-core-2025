package Lesson2.demo3;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class Comic extends Book{
    private int size;

    public Comic(int age, String material, String author, String title, int pages, int size) {
        super(age, material, author, title, pages);
        this.size = size;
    }
}
