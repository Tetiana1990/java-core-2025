package Lesson2.task2;

public class Main {
    public static void main(String[] args) {
        Ultrabook ultrabook = new Ultrabook("Acer","Intel core i7",8,1.2);
        System.out.println(ultrabook);

        Workstation workstation = new Workstation("Lenovo","Intel core i7",10,"GeForce RTX 3050");
        System.out.println(workstation);
    }
}
