package Lesson2.demo4;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
public class Person {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private final List<Skills> skills = new ArrayList<>();
    private Car car;

}
