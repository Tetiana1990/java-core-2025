package Lesson1.demo1;

public class Main {
    public static void main(String[] args) {
        Car[] cars ={
                new Car("BMW M3", 480,3.0,true),
                new Car("Audi RS5", 450,2.9,true),
                new Car("Toyota Supra",340,3.0,true),
                 new Car("Ford Mustang",450,5.0,false),
                new Car("Honda Civic Type",320,2.0,true)
    };
        for(int index =0; index< cars.length; index++){
            System.out.println(cars[index]);
        }
        System.out.println();
        Dog[] dogs = {
                new Dog(3,"Cooper","Labrador"),
                new Dog(5,"Finn","Beagle"),
                new Dog(2,"Charlie","German Shepherd"),
                new Dog(4,"Tucker","Bulldog"),
                new Dog(1,"Ollie","Poodle")
        };
    for(int index =0; index< dogs.length; index++){
        System.out.println(dogs[index]);
    }
        System.out.println();
    Book[] books = {
            new Book("Martin Eden", 200, new String[]{"Jack London", "Harriet Beecher Stowe"}, "autobiographical novel"),
            new Book("The Great Gatsby", 150, new String[]{"F. WITH. Fitzgerald", "Margaret Mitchell"}, "Novel"),
            new Book("To Kill a Mockingbird", 300, new String[]{"Harper Lee", "F. WITH. Fitzgerald"}, "Novel"),
            new Book("Catcher in the Rye", 180, new String[]{"Jerome David Salinger", "Harper Lee"}, "Novel"),
            new Book("Slaughterhouse number five", 220, new String[]{"Kurt Vonnegut", "Jerome David Salinger"}, "Novel")
    };
        for(int index =0; index< books.length; index++){
            System.out.println(books[index]);
        }

    }
};
//Dog[] dogs = {
//        new Dog(3,"Cooper","Labrador"),
//        new Dog(5,"Finn","Beagle"),
//        new Dog(2,"Charlie","German Shepherd"),
//        new Dog(4,"Tucker","Bulldog"),
//        new Dog(1,"Ollie","Poodle")
//};


