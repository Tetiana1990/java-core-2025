package Lesson3.demo1;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable{
    private String name;

    @Override
    public void print() {
        System.out.println("Magazine name: " + name);
    }
}
