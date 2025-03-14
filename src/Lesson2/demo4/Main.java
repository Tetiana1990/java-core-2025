package Lesson2.demo4;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
                Person person = new Person(
                        1,
                        "Anna",
                        "Koval",
                        "user@exempel.com",
                        25,
                        Gender.MALE,
                        new Car("Audi",2000,240)

                        );


        person.getSkills().add(new Skills("java",10));
        person.getSkills().add(new Skills("python",10));
        person.getSkills().add(new Skills("c++",10));

        System.out.println(person);



    }
}
