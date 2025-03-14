package Lesson2.demo3;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Magazine extends Book{
    private double thickness;

    public Magazine(int age, String material, String author, String title, int pages, double thickness) {
        super(age, material, author, title, pages);
        this.thickness = thickness;
    }
}
