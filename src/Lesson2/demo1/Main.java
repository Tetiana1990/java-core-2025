package Lesson2.demo1;

public class Main {

    public static void main(String[] args) {
       Person person = new Person(
                 1,
                  "Leanne",
                   "Graham",
                  "user@exemple.com",
              new Address(
                       "Light",
                      "Apt",
                      "Gwenborough",
                      "92998",
                     new Geo(
                             "15422522",
                             "1526633333"
                     )
              ),
               "123456789",
               "company.org",
               new Company(
                       "Crona",
                       "client-server",
                       "real-time"
               )
       );

    }
}
