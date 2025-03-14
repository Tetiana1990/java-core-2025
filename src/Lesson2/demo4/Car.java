package Lesson2.demo4;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {
    private String model;
    private int year;
    private int power;
}
